package org.aquacoope.mo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.aquacoope.mo.domain.*;
import org.aquacoope.mo.exception.NetworkNotFoundException;
import org.aquacoope.mo.exception.NoDataFoundException;
import org.aquacoope.mo.exception.StationNotFoundException;
import org.aquacoope.mo.repository.*;
import org.springdoc.core.converters.models.PageableAsQueryParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RequestMapping("/monitoring")
@RestController
class MonitoringController {

    private final StationsRepository stationsRepository;
    private final ParametersRepository parametersRepository;
    private final NetworksRepository networksRepository;
    private final DataRepository dataRepository;
    private final MoanaRepository moanaRepository;

    MonitoringController(StationsRepository repository,
                         ParametersRepository parametersRepository,
                         DataRepository dataRepository,
                         MoanaRepository moanaRepository,
                         NetworksRepository networksRepository) {
        this.stationsRepository = repository;
        this.parametersRepository = parametersRepository;
        this.moanaRepository = moanaRepository;
        this.dataRepository = dataRepository;
        this.networksRepository = networksRepository;
    }

    @GetMapping("/networks")
    @PageableAsQueryParam
    Page<TMonetEntity> getNetworks(
            @Parameter(hidden = true)
                    Pageable p) {
        return networksRepository.findAll(p);
    }

    @GetMapping("/network/{networkId:.+}")
    TMonetEntity getNetwork(@PathVariable String networkId) {
        return networksRepository.findByMoncode(networkId).orElseThrow(() -> new NetworkNotFoundException(networkId));
    }

    @GetMapping("/network/{networkId:.+}/stations")
    @PageableAsQueryParam
    Page<TMostationEntity> getNetworkStations(
            @PathVariable
                    String networkId,
            @Parameter(hidden = true)
                    Pageable p) {
        TMonetEntity network = networksRepository.findByMoncode(networkId).orElseThrow(() -> new NetworkNotFoundException(networkId));

        return stationsRepository.findAllBySmoncode(p, networkId);
    }

    @GetMapping("/network/{networkId:.+}/parameters")
    List<TMoparamEntity> getNetworkParameters(
            @Parameter(description = "Network id", example = "MON_SWQLT")
            @PathVariable String networkId,
            @Parameter(description = "Start date",
                    example = "2022-04-14")
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            @RequestParam(required = false)
                    Date start,
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            @RequestParam(required = false)
                    Date end) {
        List<String> codes = networksRepository.selectNetworkParametersForPeriod(networkId, start, end)
                .orElseThrow(() -> new NoDataFoundException(networkId, start, end));

        return parametersRepository.findAllById(codes);
    }

    @GetMapping("/parameters")
    @PageableAsQueryParam
    Page<TMoparamEntity> getParameters(
            @Parameter(hidden = true)
                    Pageable p) {
        return parametersRepository.findAll(p);
    }


    @GetMapping("/stations")
    @PageableAsQueryParam
    Page<TMostationEntity> getStations(
            @Parameter(hidden = true)
                    Pageable p) {
        return stationsRepository.findAll(p);
    }


    @GetMapping("/station/{stationId:.+}")
    TMostationEntity getStation(
            @PathVariable
                    String stationId) {
        return stationsRepository.findByMoscode(stationId).orElseThrow(() -> new StationNotFoundException(stationId));
    }

    @Operation(summary = "Get station data for a parameter")
    @GetMapping("/station/{stationId:.+}/data/{parameterId:.+}")
    @PageableAsQueryParam
    Page<TQtdataEntity> getStationData(
            @Parameter(description = "Station code",
                    example = "MOS_LA_00w007")
            @PathVariable
                    String stationId,
            @PathVariable
                    String parameterId,
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            @RequestParam(required = false)
                    Date start,
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            @RequestParam(required = false)
                    Date end,
            @Parameter(hidden = true)
                    Pageable p
    ) {
        if (start != null && end != null) {
            return dataRepository.findAllByQtdswmoscodeAndQtdswmopcodeAndQtdswdateBetween(p, stationId, parameterId, start, end);
        } else {
            return dataRepository.findAllByQtdswmoscodeAndQtdswmopcode(p, stationId, parameterId);
        }
    }

    @Operation(summary = "Get station data for a water quality parameter")
    @GetMapping("/station/{stationId:.+}/dataqlt/{parameterId:.+}")
    @PageableAsQueryParam
    Page<TMoanaEntity> getQLTStationData(
            @Parameter(description = "Station code",
                    example = "MOS_LA_SWQ010803001")
            @PathVariable
                    String stationId,
            @PathVariable
                    String parameterId,
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            @RequestParam(required = false)
                    Date start,
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            @RequestParam(required = false)
                    Date end,
            @Parameter(hidden = true)
                    Pageable p
    ) {
        if (start != null && end != null) {
            return moanaRepository.findAllByMoancodeAndAnmopacodeAndMoandateBetween(p, stationId, parameterId, start, end);
        } else {
            return moanaRepository.findAllByMoancodeAndAnmopacode(p, stationId, parameterId);
        }
    }
}

package org.aquacoope.mo;

import io.swagger.v3.oas.annotations.Parameter;
import org.aquacoope.mo.domain.TMonetEntity;
import org.aquacoope.mo.domain.TMoparamEntity;
import org.aquacoope.mo.domain.TMostationEntity;
import org.aquacoope.mo.domain.TQtdataEntity;
import org.aquacoope.mo.exception.NetworkNotFoundException;
import org.aquacoope.mo.exception.StationNotFoundException;
import org.aquacoope.mo.repository.DataRepository;
import org.aquacoope.mo.repository.NetworksRepository;
import org.aquacoope.mo.repository.ParametersRepository;
import org.aquacoope.mo.repository.StationsRepository;
import org.springdoc.core.converters.models.PageableAsQueryParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RequestMapping("/monitoring")
@RestController
class MonitoringController {

    private final StationsRepository stationsRepository;
    private final ParametersRepository parametersRepository;
    private final NetworksRepository networksRepository;
    private final DataRepository dataRepository;

    MonitoringController(StationsRepository repository,
                         ParametersRepository parametersRepository,
                         DataRepository dataRepository,
                         NetworksRepository networksRepository) {
        this.stationsRepository = repository;
        this.parametersRepository = parametersRepository;
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

    @GetMapping("/station/{stationId:.+}/data/{parameterId:.+}")
    @PageableAsQueryParam
    Page<TQtdataEntity> getStationData(
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
            return dataRepository.findAllByQtdmoscodeAndQtdmopcodeAndQtddateBetween(p, stationId, parameterId, start, end);
        } else {
            return dataRepository.findAllByQtdmoscodeAndQtdmopcode(p, stationId, parameterId);
        }
    }
}

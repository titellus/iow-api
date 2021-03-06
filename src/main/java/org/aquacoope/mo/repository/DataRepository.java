package org.aquacoope.mo.repository;

import org.aquacoope.mo.domain.TQtdataEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface DataRepository extends JpaRepository<TQtdataEntity, Long> {
    Page<TQtdataEntity> findAllByQtdswmoscodeAndQtdswmopcode(
            Pageable p, String stationId, String parameterId);

    Page<TQtdataEntity> findAllByQtdswmoscodeAndQtdswmopcodeAndQtdswdateBetween(
            Pageable p, String stationId, String parameterId,
            Date start, Date end);
}

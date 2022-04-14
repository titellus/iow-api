package org.aquacoope.mo.repository;

import org.aquacoope.mo.domain.TMoanaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface MoanaRepository extends JpaRepository<TMoanaEntity, Long> {
    Page<TMoanaEntity> findAllByMoancodeAndAnmopacode(
            Pageable p, String stationId, String parameterId);

    Page<TMoanaEntity> findAllByMoancodeAndAnmopacodeAndMoandateBetween(
            Pageable p, String stationId, String parameterId,
            Date start, Date end);
}

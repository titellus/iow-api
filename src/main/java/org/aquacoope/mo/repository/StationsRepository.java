package org.aquacoope.mo.repository;

import org.aquacoope.mo.domain.TMostationEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StationsRepository extends JpaRepository<TMostationEntity, Long> {
    Optional<TMostationEntity> findByMoscode(String moscode);

    Page<TMostationEntity> findAllBySmoncode(
            Pageable p, String networkId);
}

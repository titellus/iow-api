package org.aquacoope.mo.repository;

import org.aquacoope.mo.domain.TMonetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NetworksRepository extends JpaRepository<TMonetEntity, Long> {
    Optional<TMonetEntity> findByMoncode(String moncode);
}

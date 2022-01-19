package org.aquacoope.mo.repository;

import org.aquacoope.mo.domain.TMoparamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParametersRepository extends JpaRepository<TMoparamEntity, String> {

}

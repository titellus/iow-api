package org.aquacoope.mo.repository;

import org.aquacoope.mo.domain.TMonetEntity;
import org.aquacoope.mo.domain.TMoparamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface NetworksRepository extends JpaRepository<TMonetEntity, Long> {
    Optional<TMonetEntity> findByMoncode(String moncode);

    @Query(nativeQuery = true,
            value = "SELECT \"MO\".t_moparam.mopacode " +
                    " FROM (\"MO\".t_mostation INNER JOIN \"MO\".t_monet " +
                    "  ON \"MO\".t_mostation.smoncode = \"MO\".t_monet.moncode) " +
                    "  INNER JOIN (\"MO\".t_mosample INNER JOIN (\"MO\".t_moparam " +
                    "  INNER JOIN \"MO\".t_moana " +
                    "  ON \"MO\".t_moparam.mopacode = \"MO\".t_moana.anmopacode) " +
                    "  ON \"MO\".t_mosample.mosacode = \"MO\".t_moana.anmosacode) " +
                    "  ON \"MO\".t_mostation.moscode = \"MO\".t_mosample.msmoscode" +
                    " WHERE \"MO\".t_monet.moncode = :networkId" +
                    "  AND \"MO\".t_moana.moandate BETWEEN :start AND :end")
    Optional<List<String>> selectNetworkParametersForPeriod(String networkId, Date start, Date end);
}

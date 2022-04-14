package org.aquacoope.mo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "t_monet", schema = "MO", catalog = "la_national")
public class TMonetEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "moncode")
    private String moncode;
    @Basic
    @Column(name = "monname")
    private String monname;
    @Basic
    @Column(name = "monname2")
    private String monname2;
//    @Basic
//    @Column(name = "MONADORcode")
//    private String monadorcode;
    @Basic
    @Column(name = "montopic")
    private String montopic;
    @Basic
    @Column(name = "montopic2")
    private String montopic2;
    @Basic
    @Column(name = "monsubtopic")
    private String monsubtopic;
    @Basic
    @Column(name = "monsubtopic2")
    private String monsubtopic2;
//    @Basic
//    @Column(name = "MONobj")
//    private String monobj;
//    @Basic
//    @Column(name = "MONobj2")
//    private String monobj2;
//    @Basic
//    @Column(name = "MOSSurveil")
//    private String mossurveil;
//    @Basic
//    @Column(name = "MOSOperat")
//    private String mospperat;
//    @Basic
//    @Column(name = "MONetState")
//    private String monetstate;
//    @Basic
//    @Column(name = "MONst Date")
//    private String monstdate;
//    @Basic
//    @Column(name = "MOSIntercal_site")
//    private String mosintercalsite;
//    @Basic
//    @Column(name = "MOSReference_site")
//    private String mosReferenceSite;
//    @Basic
//    @Column(name = "MONcomm")
//    private String moncomm;
//    @Basic
//    @Column(name = "MONcomm2")
//    private String moncomm2;
//    @Basic
//    @Column(name = "MONUPWHO")
//    private String monupwho;
//    @Basic
//    @Column(name = "MONUPDATE")
//    private Timestamp monupdate;
//    @Basic
//    @Column(name = "moncodex")
//    private String moncodex;
//    @Basic
//    @Column(name = "MONstatus")
//    private String monstatus;
//    @JsonIgnore
//    @Basic
//    @Column(name = "MONtype")
//    private String montype;
}

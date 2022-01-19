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
@Table(name = "t_monet", schema = "MO", catalog = "biop")
public class TMonetEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "moncode")
    private String moncode;
    @Basic
    @Column(name = "monname")
    private String monname;
    @Basic
    @Column(name = "MONname2")
    private String moNname2;
    @Basic
    @Column(name = "MONADORcode")
    private String monadoRcode;
    @Basic
    @Column(name = "MONtopic")
    private String moNtopic;
    @Basic
    @Column(name = "MONtopic2")
    private String moNtopic2;
    @Basic
    @Column(name = "MONsubtopic")
    private String moNsubtopic;
    @Basic
    @Column(name = "MONsubtopic2")
    private String moNsubtopic2;
    @Basic
    @Column(name = "MONobj")
    private String moNobj;
    @Basic
    @Column(name = "MONobj2")
    private String moNobj2;
    @Basic
    @Column(name = "MOSSurveil")
    private String mosSurveil;
    @Basic
    @Column(name = "MOSOperat")
    private String mosOperat;
    @Basic
    @Column(name = "MONetState")
    private String moNetState;
    @Basic
    @Column(name = "MONst Date")
    private String moNstDate;
    @Basic
    @Column(name = "MOSIntercal_site")
    private String mosIntercalSite;
    @Basic
    @Column(name = "MOSReference_site")
    private String mosReferenceSite;
    @Basic
    @Column(name = "MONcomm")
    private String moNcomm;
    @Basic
    @Column(name = "MONcomm2")
    private String moNcomm2;
    @Basic
    @Column(name = "MONUPWHO")
    private String monupwho;
    @Basic
    @Column(name = "MONUPDATE")
    private Timestamp monupdate;
    @Basic
    @Column(name = "MONcodex")
    private String moNcodex;
    @Basic
    @Column(name = "MONstatus")
    private String moNstatus;
    @JsonIgnore
    @Basic
    @Column(name = "MONtype")
    private String moNtype;
}

package org.aquacoope.mo.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "t_mostation",
        schema = "MO",
        catalog = "biop")
public class TMostationEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "moscode")
    private String moscode;
    @Basic
    @Column(name = "hydwname")
    private String hydwname;
    @Basic
    @Column(name = "mosname")
    private String mosname;
    @Basic
    @Column(name = "mosname2")
    private String mosname2;
    @Basic
    @Column(name = "smoncode")
    private String smoncode;
    @Basic
    @Column(name = "mslocation")
    private String mslocation;
    @Basic
    @Column(name = "authname")
    private String authname;
    @Basic
    @Column(name = "mosx")
    private Double mosx;
    @Basic
    @Column(name = "mosy")
    private Double mosy;
    @Basic
    @Column(name = "mosxtxtprov")
    private String mosxtxtprov;
    @Basic
    @Column(name = "mosytxtprov")
    private String mosytxtprov;
    @Basic
    @Column(name = "MOSxtxt")
    private String moSxtxt;
    @Basic
    @Column(name = "MOSytxt")
    private String moSytxt;
    @Basic
    @Column(name = "MOSz")
    private Integer moSz;
    @Basic
    @Column(name = "mosdist_cd")
    private String mosdistCd;
    @Basic
    @Column(name = "mostype")
    private String mostype;
    @Basic
    @Column(name = "mostype2")
    private String mostype2;
    @Basic
    @Column(name = "MOSyearsta")
    private Integer moSyearsta;
    @Basic
    @Column(name = "MOSyearmdif")
    private Integer moSyearmdif;
    @Basic
    @Column(name = "MOSyearend")
    private Integer moSyearend;
    @Basic
    @Column(name = "mossit1")
    private String mossit1;
    @Basic
    @Column(name = "mossit2")
    private String mossit2;
    @Basic
    @Column(name = "distancefromhdkm")
    private Integer distancefromhdkm;
    @Basic
    @Column(name = "MOSknext")
    private String moSknext;
    @Basic
    @Column(name = "moscatha")
    private Integer moscatha;
    @Basic
    @Column(name = "MOScomm")
    private String moScomm;
    @Basic
    @Column(name = "moscomm2")
    private String moscomm2;
    @Basic
    @Column(name = "MOSMDEPT")
    private String mosmdept;
    @Basic
    @Column(name = "MANRES")
    private String manres;
    @Basic
    @Column(name = "MOSUPDATE")
    private String mosupdate;
    @Basic
    @Column(name = "mosparamcode1")
    private String mosparamcode1;
    @Basic
    @Column(name = "mosfinality")
    private String mosfinality;
    @Basic
    @Column(name = "moswbcode")
    private String moswbcode;
    @Basic
    @Column(name = "moshyecode")
    private String moshyecode;
    @Basic
    @Column(name = "moscodex")
    private String moscodex;
    @Basic
    @Column(name = "link_data")
    private String linkData;
}

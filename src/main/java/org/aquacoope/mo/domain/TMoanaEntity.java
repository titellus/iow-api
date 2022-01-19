package org.aquacoope.mo.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "t_moana", schema = "MO", catalog = "biop")
public class TMoanaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MOANCODE")
    private BigInteger moancode;
    @Basic
    @Column(name = "ANADORCODE")
    private String anadorcode;
    @Basic
    @Column(name = "anmopacode")
    private String anmopacode;
    @Basic
    @Column(name = "anmosacode")
    private String anmosacode;
    @Basic
    @Column(name = "MOANCODEX")
    private String moancodex;
    @Basic
    @Column(name = "moandate")
    private Date moandate;
    @Basic
    @Column(name = "MOANHOUR")
    private Integer moanhour;
    @Basic
    @Column(name = "moanvalue")
    private Double moanvalue;
    @Basic
    @Column(name = "MOANPRES")
    private Double moanpres;
    @Basic
    @Column(name = "MOANSIGN")
    private String moansign;
    @Basic
    @Column(name = "moanunit")
    private String moanunit;
    @Basic
    @Column(name = "MOANCOMM")
    private String moancomm;
    @Basic
    @Column(name = "MOANMODE")
    private String moanmode;
    @Basic
    @Column(name = "MOANCOND")
    private String moancond;
    @Basic
    @Column(name = "MOANCOMMANA")
    private String moancommana;
    @Basic
    @Column(name = "MOANLIMDET")
    private Double moanlimdet;
    @Basic
    @Column(name = "MOANLIMQT")
    private Double moanlimqt;
    @Basic
    @Column(name = "MOANRENDEX")
    private Integer moanrendex;
    @Basic
    @Column(name = "MOANVANAL")
    private Double moanvanal;
    @Basic
    @Column(name = "MOANUPWHO")
    private String moanupwho;
    @Basic
    @Column(name = "MOANUPDATE")
    private Date moanupdate;
    @Basic
    @Column(name = "MOANMETHODANA")
    private String moanmethodana;
    @Basic
    @Column(name = "MOANSUPPORT")
    private String moansupport;
    @Basic
    @Column(name = "MOANINSITU")
    private String moaninsitu;
    @Basic
    @Column(name = "MOANSTATUT")
    private String moanstatut;
    @Basic
    @Column(name = "MOANQUALIF")
    private String moanqualif;
}

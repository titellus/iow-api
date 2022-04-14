package org.aquacoope.mo.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "t_qtdatasw", schema = "MO", catalog = "la_national")
public class TQtdataEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "qtdswcode")
    private int qtdswcode;
    @Basic
    @Column(name = "qtdswmoscode")
    private String qtdswmoscode;
    @Basic
    @Column(name = "qtdswmopcode")
    private String qtdswmopcode;
    @Basic
    @Column(name = "qtdswdate")
    private Timestamp qtdswdate;
    @Basic
    @Column(name = "qtdswtm")
    private Timestamp qtdswtm;
    @Basic
    @Column(name = "qtdswvalue")
    private Double qtdswvalue;
    @Basic
    @Column(name = "qtdswlabel")
    private String qtdswlabel;
    @Basic
    @Column(name = "qtdswmomcode")
    private Integer qtdswmomcode;
//    @Basic
//    @Column(name = "qtdswdec")
//    private Short qtdswdec;
//    @Basic
//    @Column(name = "qtdswdecyear")
//    private Short qtdswdecyear;
//    @Basic
//    @Column(name = "qtdswwday")
//    private Short qtdswday;
//    @Basic
//    @Column(name = "qtdswmonth")
//    private Short qtdswmonth;
//    @Basic
//    @Column(name = "qtdswyear")
//    private Short qtdswyear;
//    @Basic
//    @Column(name = "qtdswhydroyear")
//    private String qtdswhydroyear;
//    @Basic
//    @Column(name = "qtdswdateddmm")
//    private String qtdswdateddmm;
//    @Basic
//    @Column(name = "qtdswswunit")
//    private String qtdswswunit;
//    @Basic
//    @Column(name = "qtdswmodeobtention")
//    private String qtdswmodeobtention;
//    @Basic
//    @Column(name = "qtdswstatut")
//    private String qtdswstatut;
//    @Basic
//    @Column(name = "qtdswuncertain")
//    private Double qtdswuncertain;
}

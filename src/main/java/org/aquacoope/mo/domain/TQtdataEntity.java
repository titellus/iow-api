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
@Table(name = "t_qtdata", schema = "MO", catalog = "biop")
public class TQtdataEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "qtdcode")
    private int qtdcode;
    @Basic
    @Column(name = "qtdmoscode")
    private String qtdmoscode;
    @Basic
    @Column(name = "qtdmopcode")
    private String qtdmopcode;
    @Basic
    @Column(name = "qtddate")
    private Timestamp qtddate;
    @Basic
    @Column(name = "qtdtm")
    private Timestamp qtdtm;
    @Basic
    @Column(name = "qtdvalue")
    private Double qtdvalue;
    @Basic
    @Column(name = "qtdlabel")
    private String qtdlabel;
    @Basic
    @Column(name = "qtdmomcode")
    private Integer qtdmomcode;
    @Basic
    @Column(name = "qtddec")
    private Short qtddec;
    @Basic
    @Column(name = "qtddecyear")
    private Short qtddecyear;
    @Basic
    @Column(name = "qtdday")
    private Short qtdday;
    @Basic
    @Column(name = "qtdmonth")
    private Short qtdmonth;
    @Basic
    @Column(name = "qtdyear")
    private Short qtdyear;
    @Basic
    @Column(name = "qtdhydroyear")
    private String qtdhydroyear;
    @Basic
    @Column(name = "qtddateddmm")
    private String qtddateddmm;
    @Basic
    @Column(name = "qtdswunit")
    private String qtdswunit;
    @Basic
    @Column(name = "qtdmodeobtention")
    private String qtdmodeobtention;
    @Basic
    @Column(name = "qtdstatut")
    private String qtdstatut;
    @Basic
    @Column(name = "qtduncertain")
    private Double qtduncertain;
}

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
@Table(name = "t_moparam",
        schema = "MO",
        catalog = "biop")
public class TMoparamEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "mopacode")
    private String mopacode;
    @Basic
    @Column(name = "PAMOFACODE")
    private String pamofacode;
    @Basic
    @Column(name = "mopaname")
    private String mopaname;
    @Basic
    @Column(name = "mopaname2")
    private String mopaname2;
    @Basic
    @Column(name = "MOPASTATUS")
    private String mopastatus;
    @Basic
    @Column(name = "MOPADCREA")
    private Timestamp mopadcrea;
    @Basic
    @Column(name = "MOPADUPDATE")
    private Timestamp mopadupdate;
    @Basic
    @Column(name = "MOPANAMESHORT")
    private String mopanameshort;
    @Basic
    @Column(name = "MOPANALELONG")
    private String mopanalelong;
    @Basic
    @Column(name = "MOPADEF")
    private String mopadef;
    @Basic
    @Column(name = "MOPAREFBIBLIO")
    private String moparefbiblio;
    @Basic
    @Column(name = "MOPACOMM")
    private String mopacomm;
    @Basic
    @Column(name = "MOPACODEINT")
    private String mopacodeint;
    @Basic
    @Column(name = "MOPACALCUL")
    private String mopacalcul;
    @Basic
    @Column(name = "MOPACAS")
    private String mopacas;
    @Basic
    @Column(name = "MOPAUNIT")
    private String mopaunit;
    @Basic
    @Column(name = "MOPATYPE")
    private String mopatype;
    @Basic
    @Column(name = "MOPANATURE")
    private String mopanature;
}

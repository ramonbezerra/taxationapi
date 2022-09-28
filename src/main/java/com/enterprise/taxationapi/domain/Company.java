package com.enterprise.taxationapi.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue ;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "company")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String fantasyName;

    private Long cpfCnpj;
    private Long municipalRegistry;
    
    private Long cnae;
    private String beginningDate;
    private String activity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id")
    private Address address;

    private Long phone;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="owner_id", insertable = false, updatable = false)
    private Owner owner;


}
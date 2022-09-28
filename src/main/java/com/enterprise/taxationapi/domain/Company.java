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
    private int cnpj;
    private int cnae;
    private String principalActivity;    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Address address;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="owner_id", insertable = false, updatable = false)
    private Owner owner;
}
package com.enterprise.taxationapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "immobile")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Immobile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private long dimension;
    private double marketValue;
    @OneToOne
    private Address address;
    @OneToOne
    private Owner owner;
}

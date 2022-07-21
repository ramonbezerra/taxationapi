package com.enterprise.taxationapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.taxationapi.domain.Immobile;

public interface ImmobileRepository extends JpaRepository<Immobile, Long>{
    
}

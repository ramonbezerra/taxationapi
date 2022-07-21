package com.enterprise.taxationapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.taxationapi.domain.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long>{
    
}

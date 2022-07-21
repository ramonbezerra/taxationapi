package com.enterprise.taxationapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.taxationapi.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{
    
}

package com.enterprise.taxationapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.taxationapi.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{
    
    Optional<Address> findByStreetNameAndNumber (String streetName, int number);
}

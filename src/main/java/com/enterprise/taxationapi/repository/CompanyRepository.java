package com.enterprise.taxationapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository ;

import com.enterprise.taxationapi.domain.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{
    
    Optional<Company> findByName (String name);

    Optional<Company> findByCnpj (int cnpj);
}

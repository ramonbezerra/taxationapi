package com.enterprise.taxationapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.taxationapi.domain.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{
    
}

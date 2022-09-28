package com.enterprise.taxationapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.enterprise.taxationapi.domain.Address;
import com.enterprise.taxationapi.domain.Company;
import com.enterprise.taxationapi.exceptions.CompanyNotFoundException;
import com.enterprise.taxationapi.exceptions.ExistingAddressException;
import com.enterprise.taxationapi.exceptions.ExistingCompanyException;


@Service
public interface CompanyService {

    public Company createCompany (Company company) throws ExistingCompanyException;

    public Company updateCompany (Long id, Company company) throws ExistingCompanyException;

    public List<Company> listAllCompanies ();

    public Company findById (Long id) throws CompanyNotFoundException;

    public Company findByCpfCnpj (int cpfOrCnpj) throws CompanyNotFoundException;

    public void deleteCompany (Long id) throws CompanyNotFoundException;

    public Company updateAddress (Long id, Address address) throws ExistingAddressException, CompanyNotFoundException;
}
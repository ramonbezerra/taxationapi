package com.enterprise.taxationapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.enterprise.taxationapi.domain.Company;
import com.enterprise.taxationapi.exceptions.CompanyNotFoundException;
import com.enterprise.taxationapi.exceptions.ExistingCompanyExcecption;


@Service
public interface CompanyService {

    public Company createCompany (Company company) throws ExistingCompanyExcecption;

    public Company updateCompany (Long id, Company company);

    public List<Company> listAllCompanies ();

    public Company findById (Long id) throws CompanyNotFoundException;

    public Company findByCnpj (int cnpj) throws CompanyNotFoundException;

    public void deleteCompany (Long id);
}
package com.enterprise.taxationapi.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enterprise.taxationapi.domain.Company;
import com.enterprise.taxationapi.exceptions.CompanyNotFoundException;
import com.enterprise.taxationapi.exceptions.ExistingCompanyException;
import com.enterprise.taxationapi.repository.CompanyRepository;
import com.enterprise.taxationapi.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company createCompany (Company company) throws ExistingCompanyException {
        if (companyRepository.findByName(company.getName()).isPresent()) {
            throw new ExistingCompanyException("Já existe uma empresa registrada com este nome!");
        }
        return companyRepository.save(company);
    }

    public Company updateCompany (Long id, Company company) throws ExistingCompanyException {
        if (!companyRepository.findById(id).isPresent()){
            try {
                return this.createCompany(company);
            } catch (ExistingCompanyException ex) {
                throw new ExistingCompanyException("Já existe uma empresa registrada com estes dados!");
            }
        } else{
            company.setId(id);
            return companyRepository.save(company);
        }
    }

    public List<Company> listAllCompanies () {
        return companyRepository.findAll();
    }

    public Company findById (Long id) throws CompanyNotFoundException{
        return companyRepository.findById(id).orElseThrow(
            () -> new CompanyNotFoundException("Não há nenhuma empresa registrada com este nome!")
        );
    }

    public Company findByCnpj (int cnpj) throws CompanyNotFoundException{
        return companyRepository.findByCnpj(cnpj).orElseThrow(
            () -> new CompanyNotFoundException("Não há nenhuma empresa registrada com este nome!")
        );
    }

    public void deleteCompany (Long id) throws CompanyNotFoundException {
        Optional<Company> companyToDelete = companyRepository.findById(id);
        if (!companyToDelete.isPresent()){
            companyRepository.delete(companyToDelete.get());
        } else {
            throw new CompanyNotFoundException("Não há nenhuma empresa registrada com esse ID!");
        }
    }
}
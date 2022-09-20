package com.enterprise.taxationapi.mapper;

import com.enterprise.taxationapi.domain.Company;
import com.enterprise.taxationapi.dto.CompanyDTO;

public class CompanyMapper {

    public CompanyDTO convertToCompanyDTO (Company company) {
        CompanyDTO companyDTO = new CompanyDTO();

        companyDTO.setAddress(company.getAddress());
        companyDTO.setCnae(company.getCnae());
        companyDTO.setCnpj(company.getCnpj());
        companyDTO.setName(company.getName());
        companyDTO.setOwner(company.getOwner());
        companyDTO.setPrincipalActivity(company.getPrincipalActivity());

        return companyDTO;
    }

    public Company convertFromCompanyDTO (CompanyDTO companyDTO) {
        
        Company company = new Company();
        
        company.setAddress(companyDTO.getAddress());
        company.setCnae(companyDTO.getCnae());
        company.setCnpj(companyDTO.getCnpj());
        company.setName(companyDTO.getName());
        company.setOwner(companyDTO.getOwner());
        
        return company;
    }
}
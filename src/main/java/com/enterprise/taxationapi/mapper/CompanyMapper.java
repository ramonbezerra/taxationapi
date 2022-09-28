package com.enterprise.taxationapi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.enterprise.taxationapi.domain.Company;
import com.enterprise.taxationapi.dto.CompanyDTO;
import com.enterprise.taxationapi.dto.UpdateCompanyAddressDTO;

public class CompanyMapper {

    @Autowired
    private ModelMapper modelMapper;

    public CompanyDTO convertToCompanyDTO (Company company) {
        CompanyDTO companyDTO = modelMapper.map(company, CompanyDTO.class);
        return companyDTO;
    }

    public Company convertFromCompanyDTO (CompanyDTO companyDTO) {
        Company company = modelMapper.map(companyDTO, Company.class);
        return company;
    }

    public UpdateCompanyAddressDTO convertToUpdateCompanyAddressDTO (Company company) {
        UpdateCompanyAddressDTO companyDTO = modelMapper.map(company, UpdateCompanyAddressDTO.class);
        return companyDTO;
    }

    public Company convertFromUpdateCompanyAddressDTO (UpdateCompanyAddressDTO companyDTO) {
        Company company = modelMapper.map(companyDTO, Company.class);
        return company;
    }

}
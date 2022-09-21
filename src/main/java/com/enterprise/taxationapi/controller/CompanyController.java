package com.enterprise.taxationapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enterprise.taxationapi.domain.Company;
import com.enterprise.taxationapi.dto.CompanyDTO;
import com.enterprise.taxationapi.mapper.CompanyMapper;
import com.enterprise.taxationapi.service.implementation.CompanyServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CompanyController {

    @Autowired
    private final CompanyServiceImpl companyServiceImpl;

    @Autowired
    private final CompanyMapper companyMapper;
    
    @GetMapping(value = "/all")
    public ResponseEntity<?> listAllCompanies() {
        List<Company> companies = companyServiceImpl.listAllCompanies();
        List<CompanyDTO> companiesDTO = new ArrayList<>();

        for (Company company : companies) {
            companiesDTO.add(companyMapper.convertToCompanyDTO(company));
        }

        return ResponseEntity.ok(companiesDTO);
    }
}
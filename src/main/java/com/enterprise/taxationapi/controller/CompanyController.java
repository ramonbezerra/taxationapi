package com.enterprise.taxationapi.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enterprise.taxationapi.domain.Company;
import com.enterprise.taxationapi.dto.CompanyDTO;
import com.enterprise.taxationapi.dto.ErrorDTO;
import com.enterprise.taxationapi.dto.UpdateCompanyAddressDTO;
import com.enterprise.taxationapi.exceptions.CompanyNotFoundException;
import com.enterprise.taxationapi.exceptions.ExistingAddressException;
import com.enterprise.taxationapi.exceptions.ExistingCompanyException;
import com.enterprise.taxationapi.mapper.CompanyMapper;
import com.enterprise.taxationapi.service.implementation.CompanyServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CompanyController {

    @Autowired
    private final CompanyServiceImpl companyService;

    @Autowired
    private final CompanyMapper companyMapper;
    
    @GetMapping
    public ResponseEntity<?> listAllCompanies() {
        List<Company> companies = companyService.listAllCompanies();
        List<CompanyDTO> companiesDTO = new ArrayList<>();

        for (Company company : companies) {
            companiesDTO.add(companyMapper.convertToCompanyDTO(company));
        }

        return ResponseEntity.ok(companiesDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listById(@PathVariable Long id){
        try {
            Company company = companyService.findById(id);
            return ResponseEntity.ok(company);
        } catch (CompanyNotFoundException ex) {
            return ResponseEntity.badRequest().body(
                new ErrorDTO(ex.getMessage()));
        }
    }

    @PostMapping
    public ResponseEntity<?> createCompany (@RequestBody CompanyDTO companyDTO) {
        try {
            companyService.createCompany(companyMapper.convertFromCompanyDTO(companyDTO));
            return new ResponseEntity<>(companyDTO, HttpStatus.CREATED);
        } catch (ExistingCompanyException ex) {
            return ResponseEntity.badRequest().body(new ErrorDTO(ex.getMessage()));
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> updateCompany (@RequestBody CompanyDTO companyDTO, @PathVariable Long id){
        try {
            Company company = companyMapper.convertFromCompanyDTO(companyDTO);
            return new ResponseEntity<>(companyService.updateCompany(id, company), HttpStatus.OK);
        } catch (ExistingCompanyException ex) {
            return ResponseEntity.badRequest().body(new ErrorDTO(ex.getMessage()));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCompany (@PathVariable Long id) {
        try {
            companyService.deleteCompany(id);
            return ResponseEntity.noContent().build();
        } catch (CompanyNotFoundException ex){
            return ResponseEntity.badRequest().body(new ErrorDTO(ex.getMessage()));
        }
    }

    @PatchMapping("/{id}/address")
    public ResponseEntity<?> updateAddress (@PathVariable Long id, @RequestBody UpdateCompanyAddressDTO companyDTO) {
        try { 
            Company company = companyMapper.convertFromUpdateCompanyAddressDTO(companyDTO);
            Company updatedCompany = companyService.updateAddress(id, company.getAddress());
            return new ResponseEntity<>(companyMapper.convertToCompanyDTO(updatedCompany), HttpStatus.NO_CONTENT);
        } catch (ExistingAddressException | CompanyNotFoundException ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}
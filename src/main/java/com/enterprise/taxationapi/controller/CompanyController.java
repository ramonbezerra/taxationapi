package com.enterprise.taxationapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.enterprise.taxationapi.service.implementation.CompanyServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CompanyController {

    private final CompanyServiceImpl companyServiceImpl;
    
    @GetMapping
    public ResponseEntity<?> listCompanyByCity(@RequestParam String city) {
        return ResponseEntity.ok().build();
    }
}

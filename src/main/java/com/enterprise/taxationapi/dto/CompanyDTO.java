package com.enterprise.taxationapi.dto;

import java.time.LocalDate;

import com.enterprise.taxationapi.domain.Address;
import com.enterprise.taxationapi.domain.Owner;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CompanyDTO {
    
    private String name;
    private String fantasyName;

    private Long cpfCnpj;
    private Long municipalRegistry;
    
    private Long cnae;
    private LocalDate beginningDate;
    private String activity;

    private Address address;
    private Long phone;

    private Owner owner;
    
}

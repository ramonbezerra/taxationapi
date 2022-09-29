package com.enterprise.taxationapi.dto;

import java.time.LocalDate;

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

    private AddressDTO address;
    private Long phone;

    private OwnerDTO owner;
    
}

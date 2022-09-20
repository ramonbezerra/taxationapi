package com.enterprise.taxationapi.dto;

import com.enterprise.taxationapi.domain.Address;
import com.enterprise.taxationapi.domain.Owner;

import lombok.Data;

@Data
public class CompanyDTO {
    
    private String name;
    private int cnpj;
    private int cnae;
    private String principalActivity;    
    private Address address;
    private Owner owner;
    
}

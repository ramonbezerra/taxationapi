package com.enterprise.taxationapi.dto;

import com.enterprise.taxationapi.domain.Address;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OwnerDTO {
    
    private String name;
    private Long cpfOrCnpj;
    private Long rg;
    private String ssp;

    private Address address;
    
    private String email;
    private Long phone;

    private boolean newsletter;
}

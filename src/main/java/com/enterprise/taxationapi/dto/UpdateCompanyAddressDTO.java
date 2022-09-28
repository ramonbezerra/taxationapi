package com.enterprise.taxationapi.dto;

import com.enterprise.taxationapi.domain.Address;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateCompanyAddressDTO {
    
    private Long id;
    private Address address;
}

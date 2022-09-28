package com.enterprise.taxationapi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateCompanyAddressDTO {
    
    private Long id;
    private AddressDTO address;
}

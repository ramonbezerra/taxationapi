package com.enterprise.taxationapi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDTO {
    
    private String street;
    private Integer number;
    private String neighborhood;

}

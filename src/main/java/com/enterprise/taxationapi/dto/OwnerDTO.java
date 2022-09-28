package com.enterprise.taxationapi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OwnerDTO {
    
    private String name;
    private Long identification;
    private int cpf;
    private int phone;
}

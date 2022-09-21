package com.enterprise.taxationapi.dto;

import lombok.Data;

@Data
public class AddressDTO {
    
    private String streetName;
    private String number;
    private String neighborhood;
    private String complement;
    private String reference;
    private int postalCode;
    private String city;
    private String state;
}

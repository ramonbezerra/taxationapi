package com.enterprise.taxationapi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.enterprise.taxationapi.domain.Address;
import com.enterprise.taxationapi.dto.AddressDTO;

public class AddressMapper {
    
    @Autowired
    private ModelMapper modelMapper;

    public AddressDTO convertToAddressDTO (Address address) {
        AddressDTO addressDTO = modelMapper.map(address, AddressDTO.class);
        return addressDTO;
    }

    public Address convertFromAddressDTO (AddressDTO addressDTO) {
        Address address = modelMapper.map(addressDTO, Address.class);
        return address;
    }
    
}

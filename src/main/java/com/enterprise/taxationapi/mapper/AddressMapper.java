package com.enterprise.taxationapi.mapper;

import com.enterprise.taxationapi.domain.Address;
import com.enterprise.taxationapi.dto.AddressDTO;


public class AddressMapper {
    
    public AddressDTO convertToAddressDTO (Address address) {
        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setCity(address.getCity());
        addressDTO.setComplement(address.getComplement());
        addressDTO.setNeighborhood(address.getNeighborhood());
        addressDTO.setNumber((address.getNumber()));
        addressDTO.setPostalCode(address.getPostalCode());
        addressDTO.setState(address.getState());
        addressDTO.setStreetName(address.getStreetName());

        return addressDTO;
    }

    public Address convertFromAddressDTO (AddressDTO addressDTO) {
        Address address = new Address();

        address.setCity(addressDTO.getCity());
        address.setComplement(addressDTO.getComplement());
        address.setNeighborhood(addressDTO.getNeighborhood());
        address.setNumber((addressDTO.getNumber()));
        address.setPostalCode(addressDTO.getPostalCode());
        address.setState(addressDTO.getState());
        address.setStreetName(addressDTO.getStreetName());

        return address;
    }
}

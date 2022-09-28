package com.enterprise.taxationapi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.enterprise.taxationapi.domain.Owner;
import com.enterprise.taxationapi.dto.OwnerDTO;

public class OwnerMapper {
    
    @Autowired
    private ModelMapper modelMapper;

    public OwnerDTO convertToOwnerDTO (Owner owner) {
        OwnerDTO ownerDTO = modelMapper.map(owner, OwnerDTO.class);
        return ownerDTO;
    }

    public Owner convertFromOwnerDTO (OwnerDTO ownerDTO) {
        Owner owner = modelMapper.map(ownerDTO, Owner.class);
        return owner;
    }
}

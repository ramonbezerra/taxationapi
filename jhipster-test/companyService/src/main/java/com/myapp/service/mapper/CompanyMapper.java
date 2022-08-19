package com.myapp.service.mapper;

import com.myapp.domain.Address;
import com.myapp.domain.Company;
import com.myapp.domain.Owner;
import com.myapp.service.dto.AddressDTO;
import com.myapp.service.dto.CompanyDTO;
import com.myapp.service.dto.OwnerDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Company} and its DTO {@link CompanyDTO}.
 */
@Mapper(componentModel = "spring")
public interface CompanyMapper extends EntityMapper<CompanyDTO, Company> {
    @Mapping(target = "owner", source = "owner", qualifiedByName = "ownerId")
    @Mapping(target = "address", source = "address", qualifiedByName = "addressId")
    CompanyDTO toDto(Company s);

    @Named("ownerId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    OwnerDTO toDtoOwnerId(Owner owner);

    @Named("addressId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    AddressDTO toDtoAddressId(Address address);
}

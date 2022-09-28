package com.enterprise.taxationapi.mapper.settings;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enterprise.taxationapi.mapper.AddressMapper;
import com.enterprise.taxationapi.mapper.CompanyMapper;
import com.enterprise.taxationapi.mapper.OwnerMapper;

@Configuration
public class MapperSettings {
    
    @Bean
    public ModelMapper modelMapper () {
        return new ModelMapper();
    }

    @Bean
    public CompanyMapper companyMapper () {
        return new CompanyMapper();
    }

    @Bean
    public OwnerMapper ownerMapper () {
        return new OwnerMapper();
    }

    @Bean
    public AddressMapper addressMapper () {
        return new AddressMapper();
    }
}

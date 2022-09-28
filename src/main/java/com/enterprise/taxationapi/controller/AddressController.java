package com.enterprise.taxationapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enterprise.taxationapi.mapper.AddressMapper;
import com.enterprise.taxationapi.service.implementation.AddressServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AddressController {
    
    @Autowired
    private final AddressServiceImpl addressService;

    @Autowired
    private final AddressMapper addressMapper;

}
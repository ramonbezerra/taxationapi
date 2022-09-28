package com.enterprise.taxationapi.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.enterprise.taxationapi.domain.Address;
import com.enterprise.taxationapi.exceptions.AddressNotFoundException;
import com.enterprise.taxationapi.exceptions.ExistingAddressException;

@Service
public interface AddressService {

    public Address createAddress (Address address) throws ExistingAddressException;

    public Address updateAddress (Long id, Address address);

    public Optional<Address> findByStreetNameAndNumber (String streetName, int number)
    throws AddressNotFoundException;

    public void deleteAddress (Long id);

    public Optional<Address> findById (Long id) throws AddressNotFoundException;
}

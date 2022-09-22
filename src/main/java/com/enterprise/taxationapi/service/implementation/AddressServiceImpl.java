package com.enterprise.taxationapi.service.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enterprise.taxationapi.domain.Address;
import com.enterprise.taxationapi.exceptions.AddressNotFoundException;
import com.enterprise.taxationapi.exceptions.ExistingAddressException;
import com.enterprise.taxationapi.repository.AddressRepository;
import com.enterprise.taxationapi.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address createAddress(Address address) throws ExistingAddressException {
        if (addressRepository.findByStreetNameAndNumber(address.getStreetName(), 
        address.getNumber()).isPresent()) {
            throw new ExistingAddressException("Já existe uma empresa registrada neste mesmo endereço!");
        }

        return addressRepository.save(address);
    }

    @Override
    public Address updateAddress(Long id, Address address) {
        address.setId(id);
        return addressRepository.save(address);
    }

    @Override
    public Optional<Address> findByStreetNameAndNumber(String streetName, int number) 
    throws AddressNotFoundException {
        if (!addressRepository.findByStreetNameAndNumber(streetName, number).isPresent()) {
            throw new AddressNotFoundException("Não há nenhuma empresa registrada com este endereço!");
        }

        return addressRepository.findByStreetNameAndNumber(streetName, number);
    }

    @Override
    public void deleteAddress(Long id) {
        Address addressToDelete = addressRepository.findById(id).get();
        addressRepository.delete(addressToDelete);
    }

    @Override
    public  Optional<Address> findById(Long id) throws AddressNotFoundException{
        if (!addressRepository.findById(id).isPresent()) {
            throw new AddressNotFoundException("Não há nenhuma empresa registrada com este endereço!");
        }

        return addressRepository.findById(id);
    }
    

}

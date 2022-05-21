package com.revature.dao;

import com.revature.models.Address;

import java.util.List;

public class AddressDAO implements IAddressDao{

    /**
     * TODO FILL OUT THE CREATEADDRESS METHOD
     * @param a an address you would like to persist
     */
    @Override
    public void createAddress(Address a) {

    }

    /**
     * TODO FILL OUT THE READADDRESSES METHOD
     * @return a list of all address from the address table
     */
    @Override
    public List<Address> readAddresses() {
        return null;
    }

    /**
     * TODO FILL OUT THE READADDRESSBYID METHOD
     * @param id the id of the wanted address
     * @return the address with the given id, if it does not exist return null
     */
    @Override
    public Address readAddressById(int id) {
        return null;
    }

    /**
     * TODO FILL OUT THE UPDATEADDRESS METHOD
     * @param a the updated address to update in the database
     */
    @Override
    public void updateAddress(Address a) {

    }

    /**
     * TODO FILL OUT THE DELETEADDRESS METHOD
     * @param a the address you would like to delete from the database
     */
    @Override
    public void deleteAddress(Address a) {

    }
}

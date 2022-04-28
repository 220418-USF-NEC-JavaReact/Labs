package com.revature.dao;

import com.revature.models.Address;

import java.util.List;

public interface IAddressDao {

    void createAddress(Address a);

    List<Address> readAddresses();

    Address readAddressById(int id);

    public void updateAddress(Address a);

    public void deleteAddress(Address a);
}

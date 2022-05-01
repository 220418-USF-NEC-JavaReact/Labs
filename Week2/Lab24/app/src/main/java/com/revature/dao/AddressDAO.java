package com.revature.dao;

import com.revature.models.Address;
import com.revature.utils.ConnectionUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class AddressDAO implements IAddressDao {

    private ConnectionUtil cs = ConnectionUtil.getConnectionUtil();

    /**
     * TODO FILL OUT THE CREATEADDRESS METHOD
     *
     * @param a an address you would like to persist
     */
    @Override
    public void createAddress(Address a) {
        Connection c = cs.getConnection();

        try {
            c.setAutoCommit(false);

            String sql = "call create createAddress(?)";
            CallableStatement call = c.prepareCall(sql);
            String[] address = new String[]{a.getAddressLineOne(),
                    a.getAddressLineOne(),
                    a.getCity(),
                    a.getState(),
                    a.getCountry(),
                    (Integer.toString(a.getZip()))};
            call.setString(1, String.valueOf(address));
            //call.setArray(1, address.toArray());
            call.set
            call.execute();

            c.setAutoCommit(true);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * TODO FILL OUT THE READADDRESSES METHOD
     *
     * @return a list of all address from the address table
     */
    @Override
    public List<Address> readAddresses(int id) {
        return null;
    }

    /**
     * TODO FILL OUT THE READADDRESSBYID METHOD
     *
     * @param id the id of the wanted address
     * @return the address with the given id, if it does not exist return null
     */
    @Override
    public Address readAddressById(int id) {
        return null;
    }

    /**
     * TODO FILL OUT THE UPDATEADDRESS METHOD
     *
     * @param a the updated address to update in the database
     */
    @Override
    public void updateAddress(Address a) {

    }

    /**
     * TODO FILL OUT THE DELETEADDRESS METHOD
     *
     * @param a the address you would like to delete from the database
     */
    @Override
    public void deleteAddress(Address a) {

    }
}

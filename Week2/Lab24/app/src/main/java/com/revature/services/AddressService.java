package com.revature.services;

import com.revature.dao.IAddressDao;
import com.revature.models.Address;

public class AddressService {

    private IAddressDao ad;

    public AddressService(IAddressDao ad){
        this.ad = ad;
    }

    public void addAddress(String content, User u){
        String term = "";
        for(int i=0;i<content.length();i++){
            if(content.charAt(i)!= '\n'){
                term += content.charAt(i);
            }
        }

        Address a = new Address();
    }

}

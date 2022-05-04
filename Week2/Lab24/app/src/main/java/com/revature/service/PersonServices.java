package com.revature.service;

import com.revature.dao.IPersonDao;
import com.revature.models.Address;
import com.revature.models.Person;

public class PersonServices {

    private IPersonDao pd;

    public PersonServices(IPersonDao pd) {
        this.pd = pd;
    }

    public void createPerson (String name, int age, String email, long socialsecurity, Address address) {
        Person newPerson = new Person(name, age, email, socialsecurity, address);
        pd.createPerson(newPerson);
    }

}

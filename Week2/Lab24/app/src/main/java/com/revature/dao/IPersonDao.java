package com.revature.dao;

import com.revature.models.Person;

import java.util.List;

public interface IPersonDao {

    void createPerson(Person p);

    List<Person> readPeople();

    Person readPersonById(int id);

    void updatePerson(Person p);

    void deletePerson(Person p);
}

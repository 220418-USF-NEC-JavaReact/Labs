package com.revature.dao;

import com.revature.models.Person;
import com.revature.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PersonDAO implements IPersonDao{
    public ConnectionUtil conSignal = ConnectionUtil.getConnectionUtil();

    /**
     * TODO FILL OUT THE CREATEPERSON METHOD
     * @param p the person you would like to persist to the database
     */
    @Override
    public void createPerson(Person p) {
        Connection c = conSignal.getConnection();

        String sql = "insert into Person (id, name, email, social, address) values ('36', '" + p.getName() + "', '" + p.getEmail() + "', '" + p.getSocialsecurity() + "', '" + p.getAddress() + "')";

        try {
            Statement s = c.createStatement();
            s.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * TODO FILL OUT THE READPEOPLE METHOD
     * @return a list of all people stored in the database
     */
    @Override
    public List<Person> readPeople() {
        return null;
    }

    /**
     * TODO FILL OUT THE READPERSONBYID METHOD
     * @param id the id of the person you would like to retrieve
     * @return the person of the given id, if no person exists null
     */
    @Override
    public Person readPersonById(int id) {
        return null;
    }

    /**
     * TODO FILL OUT THE UPDATEPERSON METHOD
     * @param p the updated person you would like to persist in the database
     */
    @Override
    public void updatePerson(Person p) {

    }

    /**
     * TODO FILL OUT THE DELETE PERSON METHOD
     * @param p the person you would like to delete from the database
     */
    @Override
    public void deletePerson(Person p) {

    }
}

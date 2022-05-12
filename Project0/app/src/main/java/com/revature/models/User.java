package com.revature.models;

import java.util.*;

public class User {
    
    private int id;
    private String firstName;
    private String lastName;
    private String userType;
    private String email;
    private String username;
    private String password;
    private List<Account> ac;

    public User(){

    }
    public User(int id, String firstName, String lastName, String userType, String email, String username, String password){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public User(String firstName, String lastName, String userType, String email, String username, String password){
        this.id = 0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        this.email = email;
        this.username = username;
        this.password = password;
        this.ac = null;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserType(){
        return userType;
    }
    public void setUserType(String userType){
        this.userType = userType;
    }
    public String getEmail(){ return email; }
    public void setEmail(String email){
        this.email = email;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public List<Account> getAc() {
        return ac;
    }

    public void setAc(List<Account> ac) {
        this.ac = ac;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userType='" + userType + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", ac=" + ac +
                '}';
    }
}

package com.shihab.databindingandroid.model;

/*
* shihab
*
* */
public class Person {

    public final String firstName;
    public final String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

}

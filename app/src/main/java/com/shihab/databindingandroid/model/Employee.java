package com.shihab.databindingandroid.model;

/**
 * Created by Shihab
 */
public class Employee {

    public final String firstName;
    public final String lastName;
    public Employee(String firstName, String lastName) {
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

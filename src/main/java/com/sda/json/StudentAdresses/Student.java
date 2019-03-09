package com.sda.json.StudentAdresses;

import com.sda.json.StudentAdresses.Address;

/**
 * @author Remigiusz Zudzin
 */
public class Student {

    String name;
    String lastName;
    Address address;

    public Student(String name, String lastName, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

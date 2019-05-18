package com.rohit.restfulwebservices.versioning;

/**
 * Created by Rohit on 07-04-2019.
 * This code is only used for learning purpose.
 */
public class Name {

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

    String firstName,lastName;

    public Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

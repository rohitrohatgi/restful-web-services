package com.rohit.restfulwebservices.versioning;

/**
 * Created by Rohit on 07-04-2019.
 * This code is only used for learning purpose.
 */
public class PersonV1 {

    public PersonV1(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

}

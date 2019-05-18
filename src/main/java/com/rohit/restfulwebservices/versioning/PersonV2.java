package com.rohit.restfulwebservices.versioning;

/**
 * Created by Rohit on 07-04-2019.
 * This code is only used for learning purpose.
 */
public class PersonV2 {

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    private Name name;

    public PersonV2(Name name){
        this.name = name;
    }

}

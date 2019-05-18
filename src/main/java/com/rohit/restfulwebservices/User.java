package com.rohit.restfulwebservices;

import java.util.Date;

/**
 * Created by Rohit on 06-04-2019.
 * This code is only used for learning purpose.
 */
public class User {

    protected User(){

    }

    public User(Integer id, String name, Date birthDate){
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    private Integer id;
    private String name;
    private Date birthDate;
}

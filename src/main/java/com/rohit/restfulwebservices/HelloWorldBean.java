package com.rohit.restfulwebservices;

/**
 * Created by Rohit on 06-04-2019.
 * This code is only used for learning purpose.
 */
public class HelloWorldBean {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }
}

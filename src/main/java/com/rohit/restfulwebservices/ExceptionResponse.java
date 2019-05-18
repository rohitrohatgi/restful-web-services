package com.rohit.restfulwebservices;

import java.util.Date;

/**
 * Created by Rohit on 07-04-2019.
 * This code is only used for learning purpose.
 */
public class ExceptionResponse {
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Date date;
    private String message;
    private String description;

    public ExceptionResponse(Date date, String message, String description) {
        this.date = date;
        this.message = message;
        this.description = description;
    }
}

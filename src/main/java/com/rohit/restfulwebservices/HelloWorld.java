package com.rohit.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

/**
 * Created by Rohit on 06-04-2019.
 * This code is only used for learning purpose.
 */

@RestController
public class HelloWorld {

    @Autowired
    MessageSource messageSource;

    @RequestMapping(method = RequestMethod.GET , path = "/hello")
    public String helloWorld(){
        return "Hello";
    }

    @RequestMapping(method = RequestMethod.GET , path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello");
    }

    @GetMapping(path = "/hello/{name}")
    public String helloWorld(@PathVariable String name){
        return "Hello " + name;
    }


    @RequestMapping(method = RequestMethod.GET , path = "/hello-world-internationalized")
    public String helloWorldInternationalized(@RequestHeader(value = "Accept-Language" , required = true) Locale locale){
        return messageSource.getMessage("good.morning.message", null, locale);
    }

}

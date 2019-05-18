package com.rohit.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rohit on 07-04-2019.
 * This code is only used for learning purpose.
 */

@RestController
public class PersonVersioningController {
    @GetMapping("v1/person")
    public PersonV1 getPersonV1(){
        return new PersonV1("Rohit Rohatgi");
    }
    @GetMapping("v2/person")
    public PersonV2 getPersonV2(){
        return new PersonV2(new Name("Rohit", "Rohatgi"));
    }

    @GetMapping(value = "/person", params = "version=1")
    public PersonV1 getPersonParamV1(){
        return new PersonV1("Rohit Rohatgi(Param)");
    }
    @GetMapping(value = "/person", params = "version=2")
    public PersonV2 getPersonParamV2(){
        return new PersonV2(new Name("Rohit", "Rohatgi (Param)"));
    }
    @GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getPersonHeaderV1(){
        return new PersonV1("Rohit Rohatgi(Header)");
    }
    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getPersonHeaderV2(){
        return new PersonV2(new Name("Rohit", "Rohatgi (Header)"));
    }

    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getPersonProducesV1(){
        return new PersonV1("Rohit Rohatgi(Header)");
    }
    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getPersonProducesV2(){
        return new PersonV2(new Name("Rohit", "Rohatgi (Header)"));
    }
}

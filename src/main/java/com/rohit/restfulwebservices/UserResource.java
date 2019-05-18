package com.rohit.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * Created by Rohit on 06-04-2019.
 * This code is only used for learning purpose.
 */
@RestController
public class UserResource {

    @Autowired
    UserDaoService userDaoService;

    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers(){
        return userDaoService.getAllUsers();
    }

    @GetMapping(path = "/users/{id}")
    public User retrieveUser(@PathVariable Integer id){
        return userDaoService.getUser(id);
    }

    @DeleteMapping(path = "/users/{id}")
    public User deleteUser(@PathVariable Integer id){
        User user = userDaoService.deleteUser(id);
        if(user == null)
            throw new UserNotFoundException("id - "+id);

        return user;
    }

    @PostMapping(path = "/users")
    public ResponseEntity<Object> createUser(@RequestBody User user){
        User savedUser =  userDaoService.addUser(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();

    }


}


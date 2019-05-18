package com.rohit.restfulwebservices;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Rohit on 06-04-2019.
 * This code is only used for learning purpose.
 */
@Controller
public class UserDaoService {
    private static List<User> allUsers = new ArrayList<>();
    static {
        allUsers.add(new User(1,"A",new Date()));
        allUsers.add(new User(2,"B",new Date()));
        allUsers.add(new User(3,"C",new Date()));
    }

    public User getUser(Integer id){
        return allUsers.stream()
                .filter(o -> id ==o.getId() )
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException("id - "+id));
    }

    public User deleteUser(Integer id){
        User user = getUser(id);
        if(user != null) {
            allUsers.remove(user);
            return user;
        }
        return null;
    }

    public List<User> getAllUsers(){
        return allUsers;
    }

    public User addUser(User user){
        if(null == user.getId())
            user.setId(allUsers.size() + 1);
        allUsers.add(user);
        return getUser(user.getId());
    }

}

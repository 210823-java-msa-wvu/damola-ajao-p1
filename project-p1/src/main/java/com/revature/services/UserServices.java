package com.revature.services;

import com.revature.models.User;
import com.revature.repos.hibernate.UserHibernate;

import java.util.List;

// Where we are going to put any business logic needed for the application to function the way we want.
// Specifically any services that need to be available to our users.
public class UserServices {

   //UserJDBC userRepo = new UserJDBC();
    UserHibernate userRepo = new UserHibernate();
    public boolean login(String username, String password) {

        // in order to log in a user, we will need username and password
        // that information is stored in our database
        // the repository layer needs to take care of this

        User u = userRepo.getByUsername(username); // more of the Sole Responsibility Principle at work

        // check to make sure User object is not null
        if (u != null) {
            // now check to make sure it matches
            if (username.equals(u.getUsername()) && password.equals(u.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public List<User> getAllUsers() {

        return userRepo.getAll();

    }

    public String UserJob(String username) {
        User u = userRepo.getByUsername(username);
        if (u != null){
            return u.getJobtitle();
        }else
        return null;
    }

    public Integer UserId(String username){
        User u = userRepo.getByUsername(username);
        if (u != null){
            return u.getId();
        }else
            return null;
    }
}

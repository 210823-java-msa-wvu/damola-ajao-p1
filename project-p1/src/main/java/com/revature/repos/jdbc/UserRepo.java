package com.revature.repos.jdbc;

import com.revature.models.User;
import com.revature.repos.CrudRepository;

import java.util.List;

public class UserRepo implements CrudRepository<User> {
    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public User getById(Integer id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Integer id) {

    }
}

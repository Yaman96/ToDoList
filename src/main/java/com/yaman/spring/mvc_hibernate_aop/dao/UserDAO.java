package com.yaman.spring.mvc_hibernate_aop.dao;

import com.yaman.spring.mvc_hibernate_aop.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();
}

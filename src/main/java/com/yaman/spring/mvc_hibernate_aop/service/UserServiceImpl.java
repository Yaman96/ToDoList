package com.yaman.spring.mvc_hibernate_aop.service;

import com.yaman.spring.mvc_hibernate_aop.dao.UserDAO;
import com.yaman.spring.mvc_hibernate_aop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}

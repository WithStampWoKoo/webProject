package com.candice.webproject.service;

import com.candice.webproject.entity.User;
import com.candice.webproject.repositoty.UserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by candice on 2018/4/13.
 */
@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;
    public User findByUsername(String userName){
        User user = null;
        try{
            user = userRepositoty.findByUserName(userName);
        }catch (Exception e){}
        return user;

    }
}

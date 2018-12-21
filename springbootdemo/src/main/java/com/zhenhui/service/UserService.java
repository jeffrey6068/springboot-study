package com.zhenhui.service;

import com.zhenhui.entity.User;
import com.zhenhui.repository.UserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Zhenhui
 * Date: 2018-09-26
 */
@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepository;

    public User findUderByName(String name) {
        User user = userRepository.findByUserName(name);
        return user;
    }
}

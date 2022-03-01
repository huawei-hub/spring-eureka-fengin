package com.hua.service;

import com.hua.entity.User;
import org.springframework.stereotype.Service;

@Service
public class ProduceServiceImpl implements ProduceService {

    @Override
    public String getUser() {
        User user = new User();
        user.setId(1001);
        user.setName("Jack");
        return user.toString();
    }
}

package com.tw.service.impl;

import com.tw.beans.User;
import com.tw.dao.impl.UserDao;
import com.tw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hbowang on 5/10/15.
 */
@Service
public class UserService implements IUserService{
    @Autowired
    private UserDao userdao;

    @Override
    public void saveUser(User user) {

    }

    public UserDao getUserdao() {
        return userdao;
    }

    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }
}

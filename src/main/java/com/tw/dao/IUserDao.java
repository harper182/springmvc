package com.tw.dao;

import com.tw.beans.User;

/**
 * Created by hbowang on 5/10/15.
 */
public interface IUserDao {
    void saveUser(User user);
    void getAllUsers();
}

package com.tw.dao.impl;

import com.tw.base.BaseDao;
import com.tw.base.BaseJpaDao;
import com.tw.beans.User;
import com.tw.dao.IUserDao;

/**
 * Created by hbowang on 5/10/15.
 */
public class UserDao extends BaseDao implements IUserDao{

    @Override
    public void saveUser(User user) {
        this.getHibernateTemplate().save(user);
    }

    @Override
    public void getAllUsers() {

    }

}

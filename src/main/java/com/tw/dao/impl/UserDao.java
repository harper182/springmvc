package com.tw.dao.impl;

import com.tw.base.BaseDao;
import com.tw.base.BaseJpaDao;
import com.tw.beans.User;
import com.tw.dao.IUserDao;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hbowang on 5/10/15.
 */
@Controller
public class UserDao extends BaseDao implements IUserDao{
    @Transactional
    @Override
    public void saveUser(User user) {
        this.getHibernateTemplate().save(user);
    }

    @Override
    public void getAllUsers() {

    }

}

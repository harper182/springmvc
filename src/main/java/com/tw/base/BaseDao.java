package com.tw.base;

import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 * Created by hbowang on 5/10/15.
 */
public class BaseDao {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

}

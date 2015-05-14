package com.tw.beans;

import com.opensymphony.xwork2.inject.Scope;
import com.tw.base.BaseDomain;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

/**
 * Created by hbowang on 5/10/15.
 */
@Entity(name="user")
@Cacheable(false)
public class User extends BaseDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

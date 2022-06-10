package org.chengshuo.bookpuls.dao;

import org.chengshuo.bookpuls.pojo.User;

import java.sql.Connection;
import java.sql.DriverManager;


public class UserDao {
    public User select(User user){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.getConnection("","root","123456");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}

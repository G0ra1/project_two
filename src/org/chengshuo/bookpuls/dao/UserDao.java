package org.chengshuo.bookpuls.dao;

import org.chengshuo.bookpuls.pojo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDao {
    public User select(User user){
        Connection conn = null;
        PreparedStatement prepar = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/book?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true", "root", "123456");
             String sql = "select * from `user` where usname =? and uspass =? and ustype != 2 ";
             prepar = conn.prepareStatement(sql);
            prepar.setString(1, user.getUsname());
            prepar.setString(2, user.getUspass());
            resultSet = prepar.executeQuery();
            User user1 = null;
            while (resultSet.next()){
                user1 = new User();
               user1.setUsid(resultSet.getInt("usid"));
               user1.setUsname(resultSet.getString("usname"));
               user1.setUspass(resultSet.getString("uspass"));
               user1.setUstype(resultSet.getInt("ustype"));
            }

            return user1;

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(resultSet != null){
                    resultSet.close();
                }
                if(prepar != null ){
                    prepar.close();
                }
                if(conn != null ){
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}

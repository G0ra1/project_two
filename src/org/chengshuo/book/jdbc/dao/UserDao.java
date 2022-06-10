package org.chengshuo.book.jdbc.dao;


import java.sql.Connection;
import org.chengshuo.book.jdbc.pojo.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    public Connection mysqlConn() throws ClassNotFoundException, SQLException {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/book?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        String user ="root";
        String passwd = "123456";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, passwd);
        return  conn;
    }

    public void querybook(Connection conn,User user) throws SQLException {
        String sql = "select * from user where user=? and passwd =?";
        PreparedStatement prepared = conn.prepareStatement(sql);


    }


}

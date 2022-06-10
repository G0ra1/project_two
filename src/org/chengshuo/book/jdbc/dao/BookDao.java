package org.chengshuo.book.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookDao {
    /*
    *
    * 链接JDBC
    *
    * */
    public Connection mysql() throws ClassNotFoundException, SQLException {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/book?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        String user = "root";
        String passwd = "123456";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, passwd);
        return conn;
    }







}

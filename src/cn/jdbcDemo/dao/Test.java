package cn.jdbcDemo.dao;

import java.sql.*;

public class Test {
    public Connection conn() throws SQLException, ClassNotFoundException {


        String SqlPath= "com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/mmm?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        String user = "root";
        String passwd = "123456";
        Class.forName(SqlPath);
        Connection con = DriverManager.getConnection(url, user, passwd);
        return con;
    }
    /*
    *
    * 插入SQL语句
    * */

    public static  int insert(Connection con) throws SQLException {
        String Sql = "insert into teacher value('867','张三','女','1878-07-15','教授','电子工程系')";
        PreparedStatement prepar = con.prepareStatement(Sql);
        int i = prepar.executeUpdate();
        return  i;
    }

    /*
    *
    * 查询数据库
    *
    * */
    public static void  select(Connection con) throws SQLException {
        String sql = "select * from teacher";
        PreparedStatement prepared = con.prepareStatement(sql);
        ResultSet query = prepared.executeQuery();
        while (query.next()){

        }
    }



    public static void main(String[] args) {
        try {
            Connection conn = new Test().conn();
            int insert = insert(conn);
            System.out.println(insert);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

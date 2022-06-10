package cn.jdbcDemo.dao;

import cn.jdbcDemo.pojo.Teacher;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherDao {
    /*
    *
    * 链接数据库
    *
    * */


    public static Connection mysql() throws ClassNotFoundException, SQLException {

        String ClassPath ="com.mysql.cj.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/mmm?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        String user ="root";
        String passwd = "123456";
        Class.forName(ClassPath);
        Connection conn = DriverManager.getConnection(URL, user, passwd);
        return conn;
    }

    /*
    *
    * 对数据库的insert
    *
    * */
    public static int insert(Connection con) throws SQLException {
        String sql ="insert into teacher value('998','马六22','男','1977-3-14','副教授','计算机系')";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
        return i;
    }

    /*
    *
    * 查询SQL一条 对象
    *
    * */


    public static void select(Connection con) throws SQLException {
        String sql="select * from teacher";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        Teacher teacher = new Teacher();
        while (resultSet.next()){
            teacher.setTno(resultSet.getString("tno"));
            teacher.setTname(resultSet.getString("tname"));
            teacher.setTsex(resultSet.getString("tsex"));
            teacher.setTbirthday(resultSet.getString("tbirthday"));
            teacher.setProf(resultSet.getString("prof"));
            teacher.setDepart(resultSet.getString("depart"));
        }
        System.out.println(teacher);
    }
    /*
    *
    * sql 语句  teacher list
    *
    * */

    public static List<Teacher> select_list(Connection con) throws SQLException {
        String sql = "select * from teacher";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Teacher> list = new ArrayList<Teacher>();

        while (resultSet.next()){
            Teacher teacher = new Teacher();
            teacher.setTno(resultSet.getString("tno"));
            teacher.setTname(resultSet.getString("tname"));
            teacher.setTsex(resultSet.getString("tsex"));
            teacher.setTbirthday(resultSet.getString("tbirthday"));
            teacher.setProf(resultSet.getString("prof"));
            teacher.setDepart(resultSet.getString("depart"));
            list.add(teacher);
        }
        return list;
    }
    public static void listfor(List<Teacher> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        try {
            Connection mysql = mysql();
            List<Teacher> list = select_list(mysql);
            listfor(list);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

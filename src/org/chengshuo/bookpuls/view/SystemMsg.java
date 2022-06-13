package org.chengshuo.bookpuls.view;

import org.chengshuo.bookpuls.pojo.User;
import org.chengshuo.bookpuls.service.UserService;

import java.util.Scanner;

public class SystemMsg {
    private final static String MENU = "欢迎进入法坤管理系统";
    private final static String LOGIN = "账号展示";
    Scanner sc = new  Scanner(System.in);
    UserService userService = new UserService();
    User user1 = null;

    public void menu() {
        user1 = new User();
        System.out.println("------------" + MENU + "-----------");
        if (userlogin().equals("登录成功")) {
            System.out.println("1、账号操作; 2、书籍操作; 3、购买书籍");
            int i = sc.nextInt();
            switch (i) {
                case 1 ->System.out.println("此模块待开发");
                case 2 -> System.out.println("此模块待开发");
                case 3 -> System.out.println("此模块待开发");
                default -> System.out.println("输入有误请重新输入");
            }


        }
    }

    public String userlogin() {
        System.out.println("请输入用户名");
        String user = sc.next();
        user1.setUsname(user);
        System.out.println("请输入密码");
        String userpass = sc.next();
        user1.setUspass(userpass);
        return userService.signUp(user1);
    }

    public void accountOperation() {
        System.out.println("--------------"+LOGIN+"-------------");


    }




}

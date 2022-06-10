package com.chengshuo.service;

import com.chengshuo.Admin;
import com.chengshuo.ICope;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminSystem extends ICopeService<Admin> {
    Scanner sc = new Scanner(System.in);
    public void  addadmin(){
        Admin admin = new Admin();
        System.out.println("请输入用户");
        admin.setUser(sc.next());
        System.out.println("请输入密码");
        admin.setPasswd(sc.next());
        add(admin);
    }
    public void queryadmin(){
        List<Admin> queryadmin = super.query();
        int n = 0;
        System.out.println("序号\t用户名\t密码");
        for (Admin a : queryadmin) {
            n++;
            System.out.println(++n+"\t"+a.getUser()+"\t"+a.getPasswd());
        }
    }
}

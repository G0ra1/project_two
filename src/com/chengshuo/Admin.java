package com.chengshuo;

import java.io.Serializable;

public class Admin  implements Serializable {
    //  用户名密码；
    private  String user;
    private String passwd;

    public Admin() {
    }

    public Admin(String user, String passwd) {
        this.user = user;
        this.passwd = passwd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}

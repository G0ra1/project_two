package org.chengshuo.book.jdbc.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private String user;
    private String passwd;

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

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}

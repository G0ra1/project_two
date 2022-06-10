package org.chengshuo.bookpuls.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private Integer usid;
    private String usname;
    private String uspass;
    private Integer ustype;

    public User(Integer usid, String usname, String uspass, Integer ustype) {
        this.usid = usid;
        this.usname = usname;
        this.uspass = uspass;
        this.ustype = ustype;
    }

    public Integer getUsid() {
        return usid;
    }

    public void setUsid(Integer usid) {
        this.usid = usid;
    }

    public String getUsname() {
        return usname;
    }

    public void setUsname(String usname) {
        this.usname = usname;
    }

    public String getUspass() {
        return uspass;
    }

    public void setUspass(String uspass) {
        this.uspass = uspass;
    }

    public Integer getUstype() {
        return ustype;
    }

    public void setUstype(Integer ustype) {
        this.ustype = ustype;
    }
}

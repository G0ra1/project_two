package org.chengshuo.bookpuls.pojo;

import java.io.Serializable;

public class BookType implements Serializable {
    private Integer btid;
    private String btname;

    public BookType() {
    }

    public BookType(Integer btid, String btname) {
        this.btid = btid;
        this.btname = btname;
    }

    public Integer getBtid() {
        return btid;
    }

    public void setBtid(Integer btid) {
        this.btid = btid;
    }

    public String getBtname() {
        return btname;
    }

    public void setBtname(String btname) {
        this.btname = btname;
    }
}

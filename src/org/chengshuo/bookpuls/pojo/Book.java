package org.chengshuo.bookpuls.pojo;

import java.io.Serializable;

public class Book  implements Serializable {
    private Integer bid;
    private String bname;
    private Integer bnum;
    private Double bprice;
    private String bmessage;
    private Integer btid;

    public Book() {
    }

    public Book(Integer bid, String bname, Integer bnum, Double bprice, String bmessage, Integer btid) {
        this.bid = bid;
        this.bname = bname;
        this.bnum = bnum;
        this.bprice = bprice;
        this.bmessage = bmessage;
        this.btid = btid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Integer getBnum() {
        return bnum;
    }

    public void setBnum(Integer bnum) {
        this.bnum = bnum;
    }

    public Double getBprice() {
        return bprice;
    }

    public void setBprice(Double bprice) {
        this.bprice = bprice;
    }

    public String getBmessage() {
        return bmessage;
    }

    public void setBmessage(String bmessage) {
        this.bmessage = bmessage;
    }

    public Integer getBtid() {
        return btid;
    }

    public void setBtid(Integer btid) {
        this.btid = btid;
    }
}

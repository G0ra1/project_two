package org.chengshuo.bookpuls.pojo;

import java.io.Serializable;

public class BookOrder implements Serializable {
   private Integer  boid;
   private Integer         bonum;
    private String bocode;
    private String        botime;
    private Double bodis;
    private Integer        bid;
    private String buyer;

    public BookOrder() {
    }

    public BookOrder(Integer boid, Integer bonum, String bocode, String botime, Double bodis, Integer bid, String buyer) {
        this.boid = boid;
        this.bonum = bonum;
        this.bocode = bocode;
        this.botime = botime;
        this.bodis = bodis;
        this.bid = bid;
        this.buyer = buyer;
    }

    public Integer getBoid() {
        return boid;
    }

    public void setBoid(Integer boid) {
        this.boid = boid;
    }

    public Integer getBonum() {
        return bonum;
    }

    public void setBonum(Integer bonum) {
        this.bonum = bonum;
    }

    public String getBocode() {
        return bocode;
    }

    public void setBocode(String bocode) {
        this.bocode = bocode;
    }

    public String getBotime() {
        return botime;
    }

    public void setBotime(String botime) {
        this.botime = botime;
    }

    public Double getBodis() {
        return bodis;
    }

    public void setBodis(Double bodis) {
        this.bodis = bodis;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }
}

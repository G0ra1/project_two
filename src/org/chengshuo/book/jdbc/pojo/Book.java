package org.chengshuo.book.jdbc.pojo;

import java.io.Serializable;

public class Book implements Serializable {
    private Integer id;
    private String bname;
    private Double bprice;
    private Integer bstore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Double getBprice() {
        return bprice;
    }

    public void setBprice(Double bprice) {
        this.bprice = bprice;
    }

    public Integer getBstore() {
        return bstore;
    }

    public void setBstore(Integer bstore) {
        this.bstore = bstore;
    }
}

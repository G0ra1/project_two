package com.chengshuo;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private Double price;
    private Integer store;
    private Integer buynumber = 0;

    public Book() {
    }

    public Book(String name, Double price, Integer store, Integer buynumber) {
        this.name = name;
        this.price = price;
        this.store = store;
        this.buynumber = buynumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Integer getBuynumber() {
        return buynumber;
    }

    public void setBuynumber(Integer buynumber) {
        this.buynumber = buynumber;
    }
}

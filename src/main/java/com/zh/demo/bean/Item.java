package com.zh.demo.bean;

import java.util.Date;

public class Item {

    private Integer id;

    private String name;

    private Date updateTime;

    private Integer inventory;

    public Integer getId() {
        return id;
    }

    public Item setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Item setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getInventory() {
        return inventory;
    }

    public Item setInventory(Integer inventory) {
        this.inventory = inventory;
        return this;
    }
}

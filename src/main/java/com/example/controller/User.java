package com.example.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzhonghua on 2017/5/9.
 */
public class User extends BaseModel{
    private String name;

    private boolean status;

    private List<Order> orders = new ArrayList<Order>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

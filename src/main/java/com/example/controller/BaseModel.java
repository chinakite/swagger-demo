package com.example.controller;

import java.util.Date;

/**
 * Created by zhangzhonghua on 2017/5/9.
 */
public class BaseModel {
    protected long id;

    protected Date created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}

package com.example.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by zhangzhonghua on 2017/5/5.
 */
@RestController
public class SwaggerDemoController {

    @ApiOperation(value="获取一个Boolean型变量", notes="传入一个Boolean型，返回一个Boolean型")
    @ApiImplicitParam(name = "b", value = "入参", required = true, dataType = "Boolean")
    @RequestMapping(value="/bool", method = RequestMethod.GET)
    public boolean boolGet(Boolean b) {
        return true;
    }

    @RequestMapping(value="/bool", method = RequestMethod.POST)
    public boolean boolPost(boolean b) {
        return false;
    }

    @RequestMapping(value="/empty", method = RequestMethod.GET)
    public void emptyGet() {

    }

    @RequestMapping(value="/str", method = RequestMethod.GET)
    public String strGet() {
        return  "Hello, Swagger Wukong Demo!";
    }

    @RequestMapping(value="/int", method = RequestMethod.GET)
    public int intGet() {
        return 100;
    }

    @RequestMapping(value="/integer", method = RequestMethod.GET)
     public Integer integerGet() {
        return 100;
    }

    @RequestMapping(value="/long", method = RequestMethod.GET)
    public long longGet() {
        return 100;
    }

    @RequestMapping(value="/longObj", method = RequestMethod.GET)
    public Long longObjGet() {
        return 100L;
    }

    @RequestMapping(value="/float", method = RequestMethod.GET)
    public float floatGet() {
        return 100.67f;
    }

    @RequestMapping(value="/floatObj", method = RequestMethod.GET)
    public Float floatObjGet() {
        return 100.67f;
    }

    @RequestMapping(value="/double", method = RequestMethod.GET)
    public double doubleGet() {
        return 100.67d;
    }

    @RequestMapping(value="/date", method = RequestMethod.GET)
    public Date dateGet() {
        return new Date();
    }

    @RequestMapping(value="/strs", method = RequestMethod.GET)
    public List<String> listStr() {
        List<String> strs = new ArrayList<String>();
        return strs;
    }

    @RequestMapping(value="/user", method = RequestMethod.GET)
    public User oneUser() {
        User user = new User();
        return user;
    }

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public List<User> listUser() {
        List<User> users = new ArrayList<User>();
        return users;
    }

    @RequestMapping(value="/mapUsers", method = RequestMethod.GET)
    public Map<String, User> mapUsers() {
        Map<String, User> users = new HashMap<String, User>();
        return users;
    }
}

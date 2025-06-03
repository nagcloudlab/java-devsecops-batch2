package com.example.app1;

import com.example.container.RequestMapping;

public class UserController {

    @RequestMapping(url = "/login")
    public void foo(){
        System.out.println("foo()..");
    }

    @RequestMapping(url = "/register")
    public void bar(){
        System.out.println("bar()..");
    }

}

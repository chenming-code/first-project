package com.bjpowernode.springboot.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;


public class TestController {

    @RequestMapping("/test/{name}/{age}")

    public Object test(@PathVariable("name") String name,
                       @PathVariable("age") String age){
        System.out.println(123);
        return "name ="+name +"age="+age;
        System.out.println(111111111111111111111111111111);
        1233156415645;
    }
}

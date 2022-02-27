package com.shah.FirstSpring.controller;

import com.shah.FirstSpring.model.Hello;
import com.shah.FirstSpring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloRestController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping("/hellosvc")
    public String sayHelloSvc() {
        return helloService.sayHello();
    }

    @RequestMapping("/hellorepo")
    public List<Hello> sayHelloList() {
        return helloService.getHelloList();
    }

    @RequestMapping("/hellomoadd")
    public String addMoHelloList() {
        return helloService.addMoHelloList();
    }

    @RequestMapping("/hellomoget")
    public List<Hello> getMoHelloList() {
        return helloService.getMoHelloList();
    }
}

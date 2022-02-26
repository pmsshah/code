package com.shah.FirstSpring;

import com.shah.FirstSpring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

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
}

package com.shah.FirstSpring.service;

import com.shah.FirstSpring.model.Hello;
import com.shah.FirstSpring.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {

    @Autowired
    HelloRepository helloRepository;

    public List<Hello> getHelloList() {
        return helloRepository.getHelloList();
    }

    public String sayHello() {
        return "Hello from Service";
    }
}

package com.shah.FirstSpring.service;

import com.shah.FirstSpring.model.Hello;
import com.shah.FirstSpring.repository.HelloMongoRepository;
import com.shah.FirstSpring.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class HelloService {

    @Autowired
    HelloMongoRepository helloMongoRepository;

    @Autowired
    HelloRepository helloRepository;

    public List<Hello> getHelloList() {
        return helloRepository.getHelloList();
    }

    public String sayHello() {
        return "Hello from Service";
    }

    public String addMoHelloList() {
        helloMongoRepository.saveAll(getHelloList());
        return "Hello Objects added to MongoDB";
    }

    public List<Hello> getMoHelloList() {
        return helloMongoRepository.findAll();
    }


}

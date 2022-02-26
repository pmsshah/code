package com.shah.FirstSpring.repository;

import com.shah.FirstSpring.model.Hello;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class HelloRepository {

    private List<Hello> helloList = new ArrayList<>(
            Arrays.asList (
                new Hello("john", "paul", "hello paul"),
                new Hello("man", "woman", "hello woman")
            ));

    public List<Hello> getHelloList() {
        return helloList;
    }
}

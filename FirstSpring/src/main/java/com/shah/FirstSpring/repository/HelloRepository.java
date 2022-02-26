package com.shah.FirstSpring.repository;

import com.shah.FirstSpring.model.Hello;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class HelloRepository {

    private List<Hello> helloList = new ArrayList<>(
            Arrays.asList (
                new Hello("john", "paul", "hello paul"),
                new Hello("Lion", "Cow", "hello cow"),
                new Hello("Fox", "Crow", "hello crow"),
                new Hello("man", "woman", "hello woman")
            ));

    public List<Hello> getHelloList() {
        return helloList;
    }
}

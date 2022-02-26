package com.shah.FirstSpring.repository;

import com.shah.FirstSpring.model.Hello;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloMongoRepository extends MongoRepository<Hello, String> {

}

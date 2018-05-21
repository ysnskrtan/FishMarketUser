package com.fishmarket.userrestapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fishmarket.userrestapi.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}

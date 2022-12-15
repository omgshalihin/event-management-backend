package com.salt.hackday.repository;

import com.salt.hackday.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {
    void deleteUserById(String id);
    User findUserById(String id);
}

package org.alexapps.readtogether.dao;

import org.alexapps.readtogether.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by OIvanchenko on 05.09.2017.
 */
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}

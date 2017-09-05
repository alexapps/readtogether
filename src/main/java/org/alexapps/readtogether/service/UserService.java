package org.alexapps.readtogether.service;

import org.alexapps.readtogether.model.User;

/**
 * Created by OIvanchenko on 05.09.2017.
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}

package org.alexapps.readtogether.service;

/**
 * Created by OIvanchenko on 05.09.2017.
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}

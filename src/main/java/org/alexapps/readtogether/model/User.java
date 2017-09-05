package org.alexapps.readtogether.model;

import org.springframework.data.annotation.Id;

/**
 * Created by OIvanchenko on 05.09.2017.
 */
public class User {
    @Id
    private String id;
    private String login;
    private String password;
    private String[] subscribtion;
    private String[] roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getSubscribtion() {
        return subscribtion;
    }

    public void setSubscribtion(String[] subscribtion) {
        this.subscribtion = subscribtion;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }
}

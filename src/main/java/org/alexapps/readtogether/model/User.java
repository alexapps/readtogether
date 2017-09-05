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
    private Subscribtion[] subscribtion;
    private Role[] roles;

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


    public Subscribtion[] getSubscribtion() {
        return subscribtion;
    }

    public void setSubscribtion(Subscribtion[] subscribtion) {
        this.subscribtion = subscribtion;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }
}

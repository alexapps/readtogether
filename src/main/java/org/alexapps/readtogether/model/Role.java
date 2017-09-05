package org.alexapps.readtogether.model;

import org.springframework.data.annotation.Id;

/**
 * Created by OIvanchenko on 05.09.2017.
 */
public class Role {
    @Id
    private String id;
    private String rName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }
}

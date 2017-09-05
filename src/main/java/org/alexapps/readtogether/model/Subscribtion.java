package org.alexapps.readtogether.model;

import org.springframework.data.annotation.Id;

/**
 * Created by OIvanchenko on 05.09.2017.
 */
public class Subscribtion {
    @Id
    private String id;

    // User id
    private String uId;
    // Book list
    private String[] bList;
}

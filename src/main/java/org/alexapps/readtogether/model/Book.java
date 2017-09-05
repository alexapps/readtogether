package org.alexapps.readtogether.model;

import org.springframework.data.annotation.Id;

/**
 * Created by OIvanchenko on 05.09.2017.
 */
public class Book {
    @Id
    private String id;

    private String bName;
    private int bLevel;
    private int bSeries;
    private boolean isFree;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public int getbLevel() {
        return bLevel;
    }

    public void setbLevel(int bLevel) {
        this.bLevel = bLevel;
    }

    public int getbSeries() {
        return bSeries;
    }

    public void setbSeries(int bSeries) {
        this.bSeries = bSeries;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}

package com.lee.model;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 3973255806951765470L;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

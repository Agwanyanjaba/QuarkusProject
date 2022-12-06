package org.wycliffe.dao;

import javax.persistence.Column;

public class Users {
    @Column
    private String email;

    //setter
    public void setId(String email) {
        this.email = email;
    }
    //getter
    public String getEmail() {
        return email;
    }
}

package com.example.dangnhap;

import java.io.Serializable;

public class Account implements Serializable {
    private String email, passworld;

    public Account(String email, String passworld) {
        this.email = email;
        this.passworld = passworld;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    @Override
    public String toString() {
        return this.email ;
    }
}

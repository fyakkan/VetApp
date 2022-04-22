package com.example.dynamic_design;

import com.example.dynamic_design.User;

public class MyVet extends User {
    private String address;

    public MyVet(int id, String username, String password) {
        super(id, username, password);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

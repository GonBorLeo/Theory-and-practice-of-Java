package com.intellekta.client;

import java.io.Serializable;

public class ContactPerson implements Serializable {
    private String name;
    private String email;
    private String phone;

    public ContactPerson(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public ContactPerson(String line) {
        String[] data = line.split(",", -1);
        this.email = data[1];
        this.name = data[0];
        this.phone = data[2];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

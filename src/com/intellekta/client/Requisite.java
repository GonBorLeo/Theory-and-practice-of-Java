package com.intellekta.client;

import java.io.Serializable;

public class Requisite implements Serializable {
    private String name;
    private String value;

    public Requisite(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Requisite(String line){
        String[] data = line.split(":", -1);
        this.name = data[0];
        this.value = data[1];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

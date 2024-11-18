package com.intellekta.consumer;

import java.util.Objects;

public class Consumer {
    private String name;
    private String shortName;
    private int country;
    private String uniqueId;

    public Consumer(String name, String shortName, int country, String uniqueId) {
        this.name = name;
        this.shortName = shortName;
        this.country = country;
        this.uniqueId = uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumer consumer = (Consumer) o;
        return country == consumer.country && Objects.equals(name, consumer.name) && Objects.equals(shortName, consumer.shortName) && Objects.equals(uniqueId, consumer.uniqueId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shortName, country, uniqueId);
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", country=" + country +
                ", uniqueId='" + uniqueId + '\'' +
                '}';
    }
}

package com.intellekta.pinapple;

public class Client {
    private long id;
    private String type;
    private String name;
    private int sum;

    public Client(long id, String type, String name, int sum) {

        this.id = (id < 100000000000L) ? 100000000000L : id;
        this.type = (!type.equals("institution") && !type.equals("individual")) ?  "institution" : type;
        this.name = (name == null) ? "Default" : name;
        this.sum = (sum < 0) ? 0 : sum;
    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

}

package com.intellekta.client;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Client implements Serializable {
    private String name;
    private ContactPerson contactPerson;
    private List<Requisite> requisites;

    public Client(String name, ContactPerson contactPerson, List<Requisite> requisites) {
        this.name = name;
        this.contactPerson = contactPerson;
        this.requisites = requisites;
    }

    public Client(String line) {
        String[] params = line.split(";");
        this.name = params[0];
        this.contactPerson = new ContactPerson(params[1]);
        this.requisites = new LinkedList<Requisite>();
        for (String item : params[2].split(",", -1)) {
            Requisite req = new Requisite(item);
            this.requisites.add(req);
        }
    }

    @Override
    public String toString() {
        String INN = null;
        String OKVED = null;
        for (Requisite requisite : requisites) {
            if (requisite.getName().equals("ИНН")) {
                INN = requisite.getName() + ":" + requisite.getValue();
            }
            if (requisite.getName().equals("ОКВЭД")) {
                OKVED = requisite.getName() + ":" + requisite.getValue();
            }
        }
        return name + ", " + contactPerson.getName() + ", " + INN + ", " + OKVED;
    }
}
package com.intellekta.client;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ImportClients {
    public static void main(String[] args) {
        String path = "C:\\Users\\Борис\\Desktop\\Clients";
        checkImport(cardsToClients(path));
    }

    public static List<Client> cardsToClients(String path) {
        File folder = new File(path);
        List<Client> clients = new ArrayList<>();

        for (File file : folder.listFiles()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                clients.add((Client) ois.readObject());
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return clients;
    }

    public static void checkImport(List<Client> clients) {
        if (clients == null || clients.isEmpty()) {
            System.out.println("import failed");
            return;
        }
        for (Client client : clients) {
            System.out.println(client);
        }
    }
}

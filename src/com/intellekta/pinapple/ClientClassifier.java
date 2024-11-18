package com.intellekta.pinapple;

public class ClientClassifier {
    public static void getClientsByType(Client[] clients, String type, Client[] result) {
        if (clients == null || clients.length == 0) {
            System.out.println("Clients array is null or empty");
            return;
        }
        if (result == null || result.length == 0) {
            System.out.println("Result array is null or empty");
            return;
        }

        for (int i = 0, j = 0; i < clients.length; i++) {
            if (j >= result.length) {
                System.out.println("Result array length exceeded");
                return;
            }
            if (clients[i].getType().equals(type)) {
                result[j++] = clients[i];
            }
        }
    }

    public static void printClients(Client[] clients) {
        if (clients == null)
            return;
        for (Client client : clients)
            System.out.println((client == null) ? "null" : String.format("{%d};{%s};{%s};{%d}", client.getId(), client.getName(), client.getType(), client.getSum()));
    }
}

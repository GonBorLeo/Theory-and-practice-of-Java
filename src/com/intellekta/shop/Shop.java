package com.intellekta.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        createShopInfo().printShopSummary();
    }

    private ArrayList<Customer> shopCustomers = new ArrayList<>();

    public void printShopSummary() {
        if (shopCustomers == null || shopCustomers.isEmpty())
            return;
        for (Customer shopCustomer : shopCustomers) {
            shopCustomer.customerInfo();
        }
    }

    public static Shop createShopInfo() {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        System.out.println("Shop data:");

        // < type >,< name >,< purchaseCount >,< documentNumber 10 + 1 >,< cardNumber 16 >

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("exit"))
                break;

            String[] lineArr = line.split(",");
            if (lineArr.length == 5) { // Если вводится больше / меньше пяти параметров
                try {
                    int type = Integer.parseInt(lineArr[0]);
                    String name = lineArr[1];
                    int purchaseCount = Integer.parseInt(lineArr[2]);
                    String documentNumber = lineArr[3];
                    String cardNumber = lineArr[4];
                    if (!documentNumber.isBlank() | !documentNumber.isBlank()) {
                        switch (type) {
                            case 1:
                                shop.shopCustomers.add(new CashCustomer(name, purchaseCount, documentNumber));
                                break;
                            case 2:
                                shop.shopCustomers.add(new CardCustomer(name, purchaseCount, cardNumber));
                                break;
                            default:
                                break;
                        }
                    } else System.out.println("Повторите ввод данных клиента");
                } catch (NumberFormatException e) { // Если type или purchaseCount не являются целыми числами
                    System.out.println("Повторите ввод данных клиента");
                }
            } else System.out.println("Повторите ввод данных клиента");
        }

        scanner.close();
        return shop;
    }
}
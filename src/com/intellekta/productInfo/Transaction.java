package com.intellekta.productInfo;

public class Transaction extends ProductInfo {
    private final double tax = 1.2;

    private double price;

    public Transaction(double price) {
        this.price = price;
    }

    public class TransactionItem extends ProductInfo {
        private double price;
        private String name;

        public TransactionItem(String name, double price) {
            this.name = (name == null || name.isBlank()) ? "Default" : name;
            this.price = (price < 0) ? 0 : price;
            getTransaction().price += price;
        }

        Transaction getTransaction() {
            return Transaction.this;
        }

        void printInfo() {
            System.out.printf("Item: %s, ", name);
            printCheck(price);
        }
    }

    public double getPrice() {
        return price;
    }

    double dealPrice() {
        return getPrice() * tax;
    }

    private void printCheck(double price) {
        System.out.println("price: " + String.format("%.2f", getPrice()));
    }

    public void printCheck() {
        System.out.print("Order ");
        printCheck(getPrice());
        System.out.printf("Total price: %.2f", dealPrice());
    }
}
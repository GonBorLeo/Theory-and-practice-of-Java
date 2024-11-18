package com.intellekta.shop;

public abstract class Customer {
    private String name; // имя
    private int purchaseCount; // количество покупок клиента
    private double discountSize = 0.0; // размер скидки

    public Customer(String name, int purchaseCount) {
        if (name == null || name.isBlank())
            this.name = "No-name";
        else if (name.trim().matches("[a-zA-Z\\s]+"))
            this.name = name;
        else {
            this.name = "No-name";
        }


        this.purchaseCount = (purchaseCount < 0) ? 0 : purchaseCount;
        if (purchaseCount > 4 & purchaseCount < 10)
            setDiscountSize(0.05);
        if (purchaseCount > 9 & purchaseCount < 15)
            setDiscountSize(0.1);
        if (purchaseCount > 14)
            setDiscountSize(0.2);
    }

    public void setDiscountSize(double discountSize) {
        this.discountSize = discountSize;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public double getDiscountSize() {
        return discountSize;
    }

    public String getName() {
        return name;
    }

    public abstract void customerInfo();
}
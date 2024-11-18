package com.intellekta.shop;

public class CardCustomer extends Customer {
    private String cardNumber;

    public CardCustomer(String name, int purchaseCount, String cardNumber) {
        super(name, purchaseCount);
        if (cardNumber != null || !cardNumber.trim().isEmpty()){
            if(cardNumber.trim().matches("\\d{16}")){
                this.cardNumber = cardNumber;
            } else {
                this.cardNumber = "0000000000000000";
            }
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void customerInfo() {
        System.out.printf("Customer %s (card: %s) has a discount %.0f %%\n", getName(), getCardNumber(), (100 * getDiscountSize()));
    }
}
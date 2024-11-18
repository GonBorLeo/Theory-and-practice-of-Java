package com.intellekta.shop;

public class CashCustomer extends Customer {
    private String documentNumber;

    public CashCustomer(String name, int purchaseCount, String documentNumber) {
        super(name, purchaseCount);
        if (documentNumber != null || !documentNumber.trim().isEmpty()){
            if (documentNumber.trim().matches("\\d{4}\\s\\d{6}")) {
                this.documentNumber = documentNumber;
            } else {
                this.documentNumber = "0000 000000";
            }
        }
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void customerInfo() {
        System.out.printf("Customer %s (passport: %s) has a discount %.0f %%\n", getName(), getDocumentNumber(), (100 * getDiscountSize()));
    }
}
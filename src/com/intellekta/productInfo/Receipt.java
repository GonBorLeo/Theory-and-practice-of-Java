package com.intellekta.productInfo;

public class Receipt {

    public static void printReceipt(ProductInfo[] productInfo) {
        Transaction transaction = new Transaction(0);
        for (ProductInfo info : productInfo) {
            transaction.new TransactionItem(info.name, info.price).printInfo();
        }
        transaction.printCheck();
    }

    public static void printTransactionInfo(Transaction.TransactionItem transactionItem){
        transactionItem.getTransaction().printCheck();
    }
}
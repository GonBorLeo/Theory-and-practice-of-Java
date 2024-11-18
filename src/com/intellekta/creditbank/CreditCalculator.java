package com.intellekta.creditbank;

import java.util.Scanner;

public class CreditCalculator {
    private String lastName; // Фамилия
    private String firstName; // Имя
    private String secondName; // Отчество
    private double interestRate; // процентная ставка по кредиту
    private double sum; // сумма кредита
    private int loanMaturity; // срок погашения кредита

    public CreditCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lastname: ");
        this.lastName = scanner.nextLine();
        while (lastName.isEmpty() || lastName.equals(" ")) {
            System.out.println("Lastname is incorrect. It must be not empty string");
            this.lastName = scanner.nextLine();
        }

        System.out.print("Firstname: ");
        this.firstName = scanner.nextLine();
        while (firstName.isEmpty() || firstName.equals(" ")) {
            System.out.println("Firstname is incorrect. It must be not empty string");
            this.firstName = scanner.nextLine();
        }

        System.out.print("Secondname: ");
        this.secondName = scanner.nextLine();

        System.out.print("Interest rate: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Interest rate is incorrect. It must be strictly positive number");
            scanner.nextLine();
        }
        this.interestRate = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Credit amount: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Credit amount is incorrect. It must be strictly positive number");
            scanner.nextLine();
        }
        this.sum = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Loan maturity: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Loan maturity is incorrect. It must be strictly positive int");
            scanner.nextLine();
        }
        this.loanMaturity = scanner.nextInt();

        scanner.close();
    }

    public void printCreditAgreement() {
        double pi = (this.sum * this.interestRate / (12 * 100)) /
                (1 - Math.pow(1 + (this.interestRate / (12 * 100)), -this.loanMaturity));
        System.out.printf("%.2f", pi);
    }
}

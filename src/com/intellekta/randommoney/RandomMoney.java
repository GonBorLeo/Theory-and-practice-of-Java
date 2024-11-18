package com.intellekta.randommoney;

import java.util.Random;

import static java.lang.Math.sin;

public class RandomMoney {
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void sale(int countOfShares, int timeOfSale) {
        setPrice(5 * sin(0.5 * timeOfSale));

        double resultSale = countOfShares * getPrice();

        if (resultSale > 0) {
            System.out.printf("The company has earned %.2f", resultSale);
        } else if (resultSale == 0) {
            System.out.print("The company did not earn anything and did not lose on the sale");
        } else {
            System.out.printf("The company has lost %.2f", resultSale);
        }
    }

    public static void testSale() {
        Random random = new Random();

        new RandomMoney().sale(random.nextInt(51), random.nextInt(51));
        new RandomMoney().sale(random.nextInt(51), random.nextInt(51));
        new RandomMoney().sale(random.nextInt(51), random.nextInt(51));
    }
}
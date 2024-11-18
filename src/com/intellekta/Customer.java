package com.intellekta;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    private int id;
    private String name;
    private String phone;
    private double purchaseCount;

    public Customer(int id, String name, String phone, double purchaseCount) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.purchaseCount = purchaseCount;
    }

    public static Map<Integer, Customer> load(Customer[] customersArr) {
        Map<Integer, Customer> customersMap = new HashMap<>(customersArr.length);
        for (Customer customer : customersArr) {
            customersMap.put(customer.id, customer);
        }
        return customersMap;
    }

    public static Customer getByld(int id, Map<Integer, Customer> customersMap) {
        return customersMap.get(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", purchaseCount=" + purchaseCount +
                '}';
    }
}

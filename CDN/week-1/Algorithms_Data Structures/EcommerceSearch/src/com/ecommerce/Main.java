package com.ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Book", "Education"),
            new Product(104, "Camera", "Electronics"),
            new Product(105, "T-shirt", "Clothing")
        };

        Product result1 = linearSearch(products, "Book");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Product not found"));

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        Product result2 = binarySearch(products, "Book");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Product not found"));
    }
}

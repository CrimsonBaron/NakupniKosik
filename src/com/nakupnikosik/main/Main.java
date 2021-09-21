package com.nakupnikosik.main;

import java.util.Scanner;

public class Main {
    public static final Product[] products = {
            new Product(75.90f, "Vepřová pečeně bez kosti"),
            new Product(7.90f, "Florian Smetanový jogurt ochucený"),
            new Product(14.90f, "Banán"),
            new Product(9.90f, "Radegast Rázna 10"),
            new Product(10.90f, "Korunní cukr krystal"),
            new Product(149.90f, "Perwoll Prací gel"),
            new Product(27.90f, "Coca-Cola"),
            new Product(29.90f, "Brambory"),
            new Product(11.90f, "Mrkev"),
            new Product(19.90f, "Dýně hokkaido")
    };

    public static void main(String[] args) {
        System.out.println("Product list:");
        float totalPrice = 0f;
        for (String arg : args) {
            int intArg = Integer.parseInt(arg);
            if (intArg < products.length){
                System.out.println("  Product: "+products[intArg].getName()+" price: "+products[intArg].getPrice());
                totalPrice += products[intArg].getPrice();
            }
        }
        System.out.println("  Total price: "+totalPrice);


    }
}


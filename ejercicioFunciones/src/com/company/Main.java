package com.company;

public class Main {

    public static void main(String[] args) {

    }

    static double addIva(double price, int iva) {
        return price + (iva * 100 / price);
    }
}

package edu.pl.wszib.java.nowosci.java14;

import edu.pl.wszib.java.inner.Client;

public class App {
    public static void main(String[] args) {
        Object o = new Client();
        if(o instanceof Client c) {
            c.getName();
        }

        CarRecord carRecord = new CarRecord("Toyota", "Corolla", 2000);
        carRecord.brand();

        System.out.println(carRecord.brand());

        carRecord.print();
    }
}

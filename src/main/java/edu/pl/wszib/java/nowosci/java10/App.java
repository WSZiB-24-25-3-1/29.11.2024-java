package edu.pl.wszib.java.nowosci.java10;

import edu.pl.wszib.java.inner.Client;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        List<Integer> copy = List.copyOf(list);

        var x = metoda();
        System.out.println(x);
        x = 8;
        System.out.println(x);
        //x = false;
    }

    public static double metoda() {
        return 7;
    }
}

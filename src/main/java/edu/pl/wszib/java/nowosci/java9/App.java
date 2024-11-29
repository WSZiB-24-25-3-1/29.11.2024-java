package edu.pl.wszib.java.nowosci.java9;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);
        Set<Integer> set = Set.of(1,2,3,4,5,6);
        Map<Integer, String> map = Map.of(1, "abc", 2, "bcd");
        Map.ofEntries(
                Map.entry("1", "2"),
                Map.entry("2", "3"),
                Map.entry("3", "4"));



        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(3, "janusz");
        mapa.put(7, "wiesiek");

        mapa.get(3);
        mapa.get(7);

        mapa.entrySet().stream()
                .filter(e -> e.getKey().equals("cos"));

        m(1);
        m(1,2,3,4);
        m(3,4,5,6,7,8,8,8,8,8,8,8);
    }

    public static void m(int... i) {
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
    }
}

package edu.pl.wszib.java.generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Pair<List<String>, Integer> pair = new Pair<>(List.of("cos"), 10);

        Map<? super List, ?> map1 = metoda(5, true, "abc");
        Map<String, Boolean> map2 = metoda("janusz", false, "abc");

        Integer i = metoda2(4);
        String s = metoda2("abc");

        //Pair<Double, Boolean> pair2 = new Pair<>(3.3, true);
    }

    public static <T, W, Z> Map<T, W> metoda(T t, W w, Z z) {
        Map<T, W> map = new HashMap<>();
        map.put(t, w);
        return map;
    }

    public static <T> T metoda2(T param) {
        return param;
    }
}

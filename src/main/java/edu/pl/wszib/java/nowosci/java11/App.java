package edu.pl.wszib.java.nowosci.java11;

public class App {
    public static void main(String[] args) {
        String s = "123";

        String s2 = s.repeat(5);

        System.out.println(s2);

        String s3 = " ABC ";

        System.out.println(s3.stripLeading());
        System.out.println(s3.stripTrailing());
        System.out.println(s3.strip());

        s3.isEmpty();

        s3.isBlank();

        String s4 = "linia 1\nlinia 2\nlinia 3\nlinia 4";

        System.out.println(s4);

        s4.lines().map(l -> "Linia: " + l).forEach(System.out::println);

    }
}

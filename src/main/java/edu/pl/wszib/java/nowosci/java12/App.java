package edu.pl.wszib.java.nowosci.java12;

public class App {
    public static void main(String[] args) {
        int x = 5;
        String s;

        switch (x) {
            case 1:
                s = "j";
                break;
            case 2:
                s = "d";
                break;
            case 3:
                s = "t";
                break;
        }

        s = switch (x) {
            case 1 -> "j";
            case 2 -> "d";
            case 3 -> "t";
            default -> "n";
        };
    }
}

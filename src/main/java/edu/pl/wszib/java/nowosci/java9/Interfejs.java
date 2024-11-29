package edu.pl.wszib.java.nowosci.java9;

public interface Interfejs {
    void metoda1();
    void metoda2();

    default void cos() {
        k1();
        k2();
        k3();
        k4();
    }

    private void k1() {
        System.out.println("k1");
    }

    private void k2() {
        System.out.println("k2");
    }

    private void k3() {
        System.out.println("k3");
    }

    private void k4() {
        System.out.println("k4");
    }
}

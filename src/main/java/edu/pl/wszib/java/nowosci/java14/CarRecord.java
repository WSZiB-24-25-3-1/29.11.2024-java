package edu.pl.wszib.java.nowosci.java14;

public record CarRecord(String brand, String model, int year) {

    public void print() {
        System.out.println("brand: " + this.brand);
        System.out.println("model: " + this.model);
        System.out.println("year: " + this.year);
    }
}

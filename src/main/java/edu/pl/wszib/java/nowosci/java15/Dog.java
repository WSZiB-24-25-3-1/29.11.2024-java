package edu.pl.wszib.java.nowosci.java15;

public sealed class Dog extends Pet permits Owczarek, Kundel {
    public Dog(String name, int age) {
        super(name, age);
    }
}

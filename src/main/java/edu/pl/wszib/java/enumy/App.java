package edu.pl.wszib.java.enumy;

public class App {
    public static void main(String[] args) {
        ClientType clientType = ClientType.B2B;

        if(clientType == ClientType.B2B) {
            System.out.println("cos tam !!");
        }

        Console console = Console.PS4;
        System.out.println(console.getBrand());
        System.out.println(console.getModel());
        System.out.println(console.getCpu());
        System.out.println(console.getGpu());
    }
}

package edu.pl.wszib.java.enumy;

public enum Console {
    PS4("Sony", "PlayStation 4", "AMD", "NVidia"),
    PS5("Sony", "PlayStation 5", "AMD", "NVidia"),
    XBOXONE("Microsoft", "XBox One", "AMD", "AMD"),
    XBOXS("Microsoft", "XBox One S", "AMD", "AMD"),
    NINTENDO("Nintendo", "Switch", "AMD", "AMD");

    private String brand;
    private String model;
    private String cpu;
    private String gpu;

    Console(String brand, String model, String cpu, String gpu) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
}

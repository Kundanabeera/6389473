package com.builder;

public class TestBuilder {
    public static void main(String[] args) {

        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();

        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setStorage("1TB SSD")
                .setOperatingSystem("Windows 11")
                .build();

        Computer officeComputer = new Computer.Builder("AMD Ryzen 5", "16GB")
                .setStorage("512GB SSD")
                .setOperatingSystem("Windows 10 Pro")
                .build();

        System.out.println("Basic Configuration: " + basicComputer);
        System.out.println("Gaming Configuration: " + gamingComputer);
        System.out.println("Office Configuration: " + officeComputer);
    }
}

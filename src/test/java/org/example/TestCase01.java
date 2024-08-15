package org.example;

public class TestCase01 {



    public static void main(String[] args) {
        System.out.println("HI");


        System.out.println("Getting class path and Operating System using environment variable");

        // Retrieve the value of the CLASS_PATH environment variable
        String classPath = System.getenv("CLASS_PATH");

        // Retrieve the value of the OS environment variable
        String operatingSystem = System.getenv("OS");

        // Print the value of the CLASS_PATH environment variable to console
        System.out.println("Class Path - " + classPath);

        // Print the value of the OS environment variable to console
        System.out.println("Operating System - " + operatingSystem);
    }
}

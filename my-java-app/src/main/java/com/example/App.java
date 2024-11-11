package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Call the add method and store the result
        int result = add(5, 3);  // Example values 5 and 3

        // Print the result of the addition
        System.out.println("The result of the addition is: " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
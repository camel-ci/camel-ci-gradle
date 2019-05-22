package com.ci.gradle;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World !");
    }

    public static String estBissextile(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return " ";
        } else {
            return " not ";
        }
    }
}

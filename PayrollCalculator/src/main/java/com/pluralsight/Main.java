package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name;
        name = scanner.nextLine();

        System.out.println("Enter Your Hours Worked");
        double hours = scanner.nextDouble();

        System.out.println("Enter pay rate");
        double rate = scanner.nextDouble();

        double output = hours * rate;

        System.out.printf("grossPay %.2f and %.2f is = %.2f\n", hours, rate, hours * rate);
    }
}
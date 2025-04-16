package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // stating a name

        System.out.println("Enter your name ");
        String name;
        name = scanner.nextLine();

        //stating the hours worked
        System.out.println("Enter Your Hours Worked ");
        double hours;
        hours = scanner.nextDouble();

        //The rate worked
        System.out.println("Enter pay rate ");
        double rate;
        rate = scanner.nextDouble();

        //calculating the out
        double output = hours * rate;

        //showing the result
        System.out.printf("hours %.2f, rate %.2f = %.2f\n", hours, rate, hours * rate);

    }
}
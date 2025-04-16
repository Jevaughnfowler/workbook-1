package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        //Welcome, prompt for additional response
        System.out.println("Hi! Welcome To The SandwichShop");
        System.out.println("Here is our menu");
        System.out.println("please choose an option");
        System.out.println("1: Regular: base price $5.45 ");
        System.out.println("2: Large: base price $8.95");
        System.out.println("Please enter age to see if any discount applies ");

        System.out.println("Choose your Option (1,2)");
        choice = scanner.nextInt();

        //Checking age for discount
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        //checking to see if discount applies
        double discount = 0.0;

        if (age <= 17) {
            discount = 0.10;
            System.out.println("receive a 10% discount");
        }else if (age >= 65) {
            discount = 0.20;
            System.out.println("receive a 20% discount");

        }else {
            System.out.println("No discount apply");
        }

        //Calculating the Discount
        double price = 0.0;
        if (choice == 1) {
            price = 5.45;
        } else if (choice == 2) {
            price = 8.95;
        } else {
            System.out.println("No selection");
            return;
        }

        double discountPrice = price * discount;
        double totalAmount = price - discountPrice;

        //output total
        System.out.println("Price $" + price);
        System.out.println("Discount applied $" + discountPrice);
        System.out.println("TotalAmount $" + totalAmount);









    }
}
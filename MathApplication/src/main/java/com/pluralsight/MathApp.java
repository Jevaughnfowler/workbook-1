package com.pluralsight;

public class MathApp{

    public static void main(String[] args){

        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        // Question 1:
            double bobSalary = 70000;
            double graySalary = 85000;

            double highestSalary;

            highestSalary = Math.max(bobSalary , graySalary);

            System.out.println("The answer is " +highestSalary);

        //////////////////////
        // Question 2:
            double carPrice = 20000;
            double truckPrice = 45000;

            double lowestPrice = Math.min(carPrice, truckPrice);

            System.out.println("The answer is " + lowestPrice);
        /////////////////////////
        // Question 3:
            double radius = 7.25;
            double area = Math.PI * Math.pow(radius, 2);


            System.out.println("The answer is " + radius + area);

        ///////////////////////////////////////
        // Question 4:
            double number = 5;
            double squareRoot = Math.sqrt(number);

            System.out.println(squareRoot);
        ///////////////////////////////////////
        // Question 5:
        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;

        double distance = Math.sqrt( (Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2) );

        System.out.println("The answer is " + distance);
        ///////////////////////////////////////////
        // Question 6:
        double numbers = -3.8;
        double absoluteValue = Math.abs(numbers);

        System.out.println("The value is " + absoluteValue);
        //////////////////////////////
        // Question 7:
        double randomNumber = Math.random();

        System.out.println("Random number between 0 and 1 " + randomNumber);





        }



    }


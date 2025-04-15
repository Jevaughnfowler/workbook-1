import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

     // Exercise 3
     // Step 1:

        System.out.println("Whats your name?");
        String name;
        name = scanner.nextLine();

        System.out.println("Hi " + name + " what do you want Multiply?");

        System.out.println("What is the first number? ");
        double number = scanner.nextDouble();

        System.out.println("What is the second Number? ");
        double number1 = scanner.nextDouble();

        double answer = number * number1;

        System.out.printf("The answer %.2f and %.2f is = %.4f\n", number,number1, number * number1 );




    }
}

package Factorial_111.UsingFunctional;

import java.util.Scanner;

public class FactorialUsingFunctional {
    static void main() {
        Scanner input = new Scanner(System.in);
        FactorialInterface obj = x ->{
            long result = 1;
            for (int i=1; i<=x; i++){
                result *= i;
            }
            return result;
        };

        System.out.println("Welcome to Factorial using Functional Programming ");
        System.out.print("Enter a number to Find Factorial: ");
        int number = input.nextInt();
        long result = obj.factorialFinder(number);

        System.out.printf("Factorial of %d is: %d", number, result );

    }
}

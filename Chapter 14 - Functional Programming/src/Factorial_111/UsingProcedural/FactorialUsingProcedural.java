package Factorial_111.UsingProcedural;

import java.util.Scanner;

public class FactorialUsingProcedural {
    static void main() {
        Scanner input = new Scanner(System.in);
        FactorialUsingProcedural obj = new FactorialUsingProcedural();
        System.out.println("Welcome to Factorial Finder using Procedural Way: ");
        System.out.print("enter a number to find Factorial: ");
        int number = input.nextInt();
        long result = obj.factorialFinder(number);
        System.out.printf("Factorial of %d is: %d", number, result);


    }

    protected long factorialFinder(int x){
        if(x == 0 || x == 1){
            return 1;
        }
        return x * factorialFinder(x-1);
    }
}

package Arithmetic_87;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionClass {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to division calculator");
        int first, second;
    try {
        System.out.print("enter first number: ");
        first = input.nextInt();
        System.out.print("now, enter second number: ");
        second = input.nextInt();
        double result = first / second;
        System.out.println("Your division result is: " + result);

    }catch (InputMismatchException e) {
        System.out.println("Plz enter a valid input in Number");
    } catch (ArithmeticException e){
            if(e.getMessage().equals("/ by zero")){
                System.out.println("You can not divide a number by zero ");
            }
        }
            finally {
             System.out.println("Thanks for using our services");
        }

    }
}

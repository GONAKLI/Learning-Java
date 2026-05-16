import java.util.Scanner;

public class Challenge30 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a number to find factorial:  ");
        int number = input.nextInt();
        long result = factorial(number);
        System.out.println("factorial of " + number + " is " + result);
    }


    static long factorial(int number){
        int i = number;
        long result=1;
        while (i > 0) {
            result *= i;
            i--;
        }
        return result;
    }
}

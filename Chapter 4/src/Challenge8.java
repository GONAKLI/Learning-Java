import java.util.Scanner;

public class Challenge8 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        int first = input.nextInt();
        System.out.println("enter second number");
        int second = input.nextInt();

        System.out.println(first + " + " + second + " is " + (first + second));
        System.out.println(first + " - " + second + " is " + (first - second) );
        System.out.println(first + " * " + second + " is " + (first * second));
        System.out.println(first + " / " + second + " is " + (first / second));
        System.out.println(first + " % " + second + " is " + (first % second));
    }
}

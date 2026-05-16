import java.util.Scanner;

public class Challenge5 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = input.nextInt();
        System.out.println("enter second number");
        int second = input.nextInt();
        int sum = first + second;
        System.out.println("sum of " + first + "+" + second +" is " + sum);
    }
}

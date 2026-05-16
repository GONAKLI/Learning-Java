import java.util.Scanner;

class minimumNumberFinder {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to minimum number finder ");
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter second number: ");
        int second = input.nextInt();

        int minimum = first < second ? first : second ;
        System.out.println("minimum number is: " + minimum);
    }
}

import java.util.Scanner;

class OddOrEven {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to odd or even ");
        System.out.println("enter a number ");
        int number = input.nextInt();

        String result = number % 2 == 0 ? "Even" : "Odd" ;
        System.out.println("given number is " + result);
    }
}

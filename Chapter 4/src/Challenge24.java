import java.util.Scanner;

public class Challenge24 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number ");
        int number = input.nextInt();
        int result = ~number;

        System.out.println("result is " + result);
    }
}

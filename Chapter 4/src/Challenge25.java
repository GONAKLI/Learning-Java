import java.util.Scanner;

public class Challenge25 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        int number = input.nextInt();
        number = number << 2;
        System.out.println("result is " + number);
    }
}

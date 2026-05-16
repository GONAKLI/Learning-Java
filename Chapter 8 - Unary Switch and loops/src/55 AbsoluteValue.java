import java.util.Scanner;

class AbsoluteValue {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to absolute value finder ");
        System.out.print("enter a number: ");
        int number = input.nextInt();

        int absolute = number >= 0 ? number : number * -1;

        System.out.println("absolute value is " + absolute);
    }
}

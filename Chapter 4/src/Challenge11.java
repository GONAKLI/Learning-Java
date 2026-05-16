import java.util.Scanner;

public class Challenge11 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("enter Base length of triangle ");
        float b = input.nextFloat();
        System.out.println("enter height of triangle ");
        float h = input.nextFloat();

        double area = (1/2f * b * h);

        System.out.println("area of triangle is " + area );
    }
}

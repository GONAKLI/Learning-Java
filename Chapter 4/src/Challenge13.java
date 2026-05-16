import java.util.Scanner;

public class Challenge13 {
    static void main() {
        Scanner input = new Scanner(System.in);
float p, t, interest;
double CI;
        System.out.println("enter principal amount ");
        p = input.nextFloat();
        System.out.println("enter time in years ");
        t = input.nextFloat();
        System.out.println("enter interest rate ");
        interest = input.nextFloat();

        CI = p * Math.pow((1f + interest / 100f),t);

        System.out.println("compound interest is " + CI);

    }
}

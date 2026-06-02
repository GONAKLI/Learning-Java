import java.util.Scanner;

class SimpleInterest {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator");
 float p, t, interest;
        System.out.println("enter principal amount ");
        p = input.nextFloat();
        System.out.println("enter time period in years ");
        t = input.nextFloat();
        System.out.println("enter interest rate ");
        interest = input.nextFloat();
  float SI = (p * t * interest)/100;

        System.out.println("simple interest is " + SI);
    }
}

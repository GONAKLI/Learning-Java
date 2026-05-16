import java.util.Scanner;

public class Challenge17 {
    static void main() {
        Scanner input = new Scanner(System.in);
        float num1, num2, num3;
        System.out.println("enter first number ");
        num1 = input.nextFloat();
        System.out.println("now, enter second number ");
        num2 = input.nextFloat();
        System.out.println("finally, enter third number ");
        num3 = input.nextFloat();

        if(num1 > num2 && num1 > num3){
            System.out.println("first number is greater " + num1);
        } else if (num2 > num1 && num2 > num3 ) {
            System.out.println("second number is greater " + num2);
        } else if (num3 > num1 && num3 >  num2) {
            System.out.println("third number is greater " + num3);
        } else if (num1 == num2 || num2 == num3  || num3 == num1) {
            System.out.println("i think all  number are equal");
        }
    }
}

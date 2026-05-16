import java.util.Scanner;

public class Challenge37 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = input.nextInt();
        isArmStrongNumber(number);
    }
    static void isArmStrongNumber(int number){
        int digit = String.valueOf(number).length();
        int originalNumber = number;
        int i =0;
        double armValue =0;
        while(i < digit){
            armValue += Math.pow(number%10,digit);
            number = number/10;
            i++;
        }

        if(armValue == originalNumber){
            System.out.println("Yay, its an Arm Strong Number ");
        }else{
            System.out.println("Sorry, its not Arm Strong Number");
        }


    }
}

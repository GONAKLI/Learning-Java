import java.util.Scanner;

public class Challenge35 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = input.nextInt();
        int result = reverse(number);
        System.out.println("reversed number is: " + result);
    }
    static int reverse(int num){
        String reversed ="";
        while(num != 0){
            reversed = reversed + num%10;
            num = num/10;


        }
        if(reversed.length() > 0){
            return Integer.parseInt(reversed);
        }else{
            return 0;
        }

    }
}

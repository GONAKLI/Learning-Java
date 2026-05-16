import java.util.Scanner;

public class Challenge18 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter year ");
        int year = input.nextInt();

        if (year%4 == 0 && year % 100 != 0 ){
            System.out.println("its a leap year");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(" its a leap year ");
        } else{
            System.out.println("its not a leap year");
        }
    }
}

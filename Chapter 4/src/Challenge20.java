import java.util.Scanner;

public class Challenge20 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age ");
        int age = input.nextInt();
        if (age < 13){
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teen");
        } else if (age < 60) {
            System.out.println("Adult");
        } else if (age > 60) {
            System.out.println("Senior");
        }
    }
}

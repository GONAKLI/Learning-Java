import java.util.Scanner;

public class Challenge16 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number ");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println("its an even number");
        }
        else{
            System.out.println("its an odd number ");
        }
    }
}

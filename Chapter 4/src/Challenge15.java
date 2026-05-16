import java.util.Scanner;

public class Challenge15 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number ");
        int number = input.nextInt();

        if(number > 0){
            System.out.println("its a positive number ");
        } else if (number == 0) {
            System.out.println("its a zero ");
        }
        else if (number < 0){
            System.out.println("its a negative number ");
        }
    }
}

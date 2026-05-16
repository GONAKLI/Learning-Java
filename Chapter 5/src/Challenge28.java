import java.util.Scanner;

public class Challenge28 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number to find table: ");
        int number = input.nextInt();
        Table(number);

    }

    public static void Table(int number){
        int i =1;
        while(i<=10){
            System.out.println(number + " X " + i + " = " + (number*i));
            i++;
        }
    }
}

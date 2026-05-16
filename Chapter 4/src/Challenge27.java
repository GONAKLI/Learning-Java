import java.util.Scanner;

public class Challenge27 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number ");
        int number = input.nextInt();
       int result = number & 0001;
       if(result == 1){
           System.out.println("its an odd number ");
       }else{
           System.out.println("its an even number ");
       }
    }
}

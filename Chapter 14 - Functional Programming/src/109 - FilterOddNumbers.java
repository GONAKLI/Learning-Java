import java.util.ArrayList;
import java.util.Scanner;

class FilterOddNumbers {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to odd number filter, using stream for implementation");
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i<10; i++){
            System.out.printf("Now, enter %d number: ", (i+1) ) ;
            numList.add(input.nextInt());
        }

        numList.stream().filter(num -> num % 2 != 0).forEach(num ->
                System.out.println("odd numbers are: " + num));
    }
}

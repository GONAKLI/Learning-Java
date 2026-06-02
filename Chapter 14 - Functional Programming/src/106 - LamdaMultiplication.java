import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LamdaMultiplication {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to multiplication using lambda");
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("enter first number: ");
        list.add(input.nextInt());
        System.out.print("Now, enter second number: ");
        list.add(input.nextInt());

        List<Integer> numbers = List.of(5,7,10,15,17,25,90);

        int result = list.stream()
                .reduce(1, (a,b)-> a*b);
        System.out.println("Multiplication is: " + result);

        long result2 = numbers.stream()
                .reduce(1, (x, y)-> x*y);

        System.out.println("Multiplication of list Items are: " + result2);

    }


}

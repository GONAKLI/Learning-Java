package Factorial_111.UsingFunctional;

import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AnotherWay {
    static void main() {
        Scanner input = new Scanner(System.in);
        AnotherWay obj = new AnotherWay();
        System.out.println("welcome to find factorial in another way");
        System.out.print("enter a number to find factorial: ");
        obj.optFact(input.nextInt());

    }

    void optFact(int num){
       IntStream.rangeClosed(2, num)
               .reduce( (a,b) -> a*b)
               .ifPresent(System.out::println);

    }
}

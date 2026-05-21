package NestedClass_82;

import java.util.Scanner;

public class TestArrayOperations {
    static void main() {
        ArrayOperations.Statistics obj = new ArrayOperations.Statistics();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to test nested class in java");
        System.out.print("now enter size of your array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i=0; i<size; i++){
            System.out.print("enter element number " + (i+1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println("Thanks for entering the array elements");
        System.out.println("here is your mean: " + obj.mean(array));
        System.out.println("here is your median: " + obj.median(array));
    }
}

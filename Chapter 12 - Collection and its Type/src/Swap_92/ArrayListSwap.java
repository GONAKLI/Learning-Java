package Swap_92;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSwap {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to swapping of elements ");
        ArrayList<String> students = new ArrayList<>();
        students.add("pawan");
        students.add("pankaj");
        students.add("bhim");
        students.add("vijay");
        students.add("naresh");
        System.out.println(students);
        System.out.println("which two elements you want to swipe(enter position): ");
        int position1 = input.nextInt() - 1;
        int position2 = input.nextInt() - 1;
        String temp = students.get(position1);
        students.set(position1, students.get(position2));
        students.set(position2, temp);
        System.out.println(students);
    }
}

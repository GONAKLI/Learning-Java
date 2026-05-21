package MethodOverload_85;

import java.util.Scanner;

public class TestCalc {
    static void main() {
        Scanner input = new Scanner(System.in);
        Calculator obj = new Calculator();
        System.out.println("Welcome to calculator class Test");
        System.out.println(obj.add(7,3) );
        System.out.println(obj.add(3,3,3) );
        System.out.println(obj.add(77.55,15.92) );
    }
}

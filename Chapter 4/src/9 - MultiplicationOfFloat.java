import java.util.Scanner;

class MultiplicationOfFloat {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to floating number multiplication");

        System.out.println("enter first floating number ");
        float first = input.nextFloat();
        System.out.println("enter second floating number ");
        float second = input.nextFloat();
        System.out.println("product is " + (first * second ));

    }
}

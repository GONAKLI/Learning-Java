import java.util.Scanner;

class IsPrime {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Prime number finder ");
        System.out.println("enter a number ");
        int number = input.nextInt();
        String result = checkPrime(number);
        System.out.println("given number is " + result);
    }
    static String checkPrime(int number){
        int i = 2;
        while(i<number){
            if(number % i == 0) {
                return "Not Prime";
            }
            i++;

        }
        return  "Prime";
    }
}

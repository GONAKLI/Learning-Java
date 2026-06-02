import java.util.Scanner;

class SumOfDigits2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number ");
        int number = input.nextInt();
        int result = checkSum(number);
        System.out.println("sum is " + result);
    }
    static int checkSum(int number){
        int sum =0;

        while(number !=0 ) {
            sum += number % 10;
            number /= 10;

        }
        return sum;
    }
}

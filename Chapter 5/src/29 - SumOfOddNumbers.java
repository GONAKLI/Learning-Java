import java.util.Scanner;

class SumOfOddNumbers {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("we find sum of n odd numbers here ");
        System.out.print("enter the nth number ");
        int number = input.nextInt();
        int result = sumOfOdd(number);
        System.out.println("sum of odd number is " + result );
    }

    static int sumOfOdd(int number){
        int i = 1;
        int sum =0;
        while (i<=number){
            sum += i;
            i += 2;
        }
        return sum;
    }
}

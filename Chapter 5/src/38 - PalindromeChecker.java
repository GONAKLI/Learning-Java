import java.util.Scanner;

class PalindromeChecker {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to palindrome checker");
        System.out.println("enter a number ");
        int number = input.nextInt();
        boolean isPalindrome = isPalindrome(number);
        if(isPalindrome){
            System.out.println("given number is a palindrome ");
        }else{
            System.out.println("its, not a palindrome number ");
        }
    }
    static boolean isPalindrome(int number){
        int num = number;
        int reversed = 0;
        while(number > 0){
            reversed = (reversed*10) + (number %10);
            number /= 10;
        }
        if(reversed == num){
            return true;
        }else return false;

    }
}

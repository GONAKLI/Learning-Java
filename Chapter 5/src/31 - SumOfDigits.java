import java.util.Scanner;

class SumOfDigits{

void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number ");
        String number = input.next();
        int result = checkSum(number);
        System.out.println("sum of " + number + " digit is " + result );
}

static  int checkSum(String number){
        int lengthOfDigit = number.length();

        int sum = 0;
        int i = 0 ;
        while (i < lengthOfDigit ){

                sum += (int) number.charAt(i) - '0';
            i++;
        }
        return sum;
}

}
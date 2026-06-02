package FunctionalInterface_110;


import java.util.Scanner;

public class PrimeUsingFunctional{


    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to prime Checker");

        IsPrimeInterface obj = num -> {
            for (int i=2; i<num; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        };

        System.out.print("now, enter your number: ");
        int checkNum = input.nextInt();

 if(obj.isPrime(checkNum)){
     System.out.printf("%d: Number is prime", checkNum);
 }else {
     System.out.printf("%d: Number is not prime", checkNum);
 }
    }

}

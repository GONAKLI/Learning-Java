import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class PrimeOrNot {
    static void main() {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number finder ");
        System.out.print("enter a number: ");
        int number = input.nextInt();
        PrimeOrNot obj = new PrimeOrNot();
      boolean result =  obj.checkPrime(number);
      if(result){
          System.out.println("YAY, number is prime");
      }else{
          System.out.println("SORRY, number is not prime");
      }

    }

    public boolean checkPrime(int num){
        for (int i =2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }


}

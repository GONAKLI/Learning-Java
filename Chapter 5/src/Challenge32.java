import java.util.Scanner;

public class Challenge32 {
    static void main() {
        int first, second;
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number ");
        first = input.nextInt();
        System.out.println("now, enter second number ");
        second = input.nextInt();
        int res = lcm(first, second);
        System.out.println("lowest common multiple is " + res);
    }
    static int lcm(int first, int second){
        int mul;
        boolean condition = true;
        int i = 1;
        while(condition){
           mul = first * i;
           int j =1;
           while(j<=mul){
               if(second * j == mul){
                   return second*j;
               }
               j++;
           }
           i++;
        }
        return  0;
    }
}

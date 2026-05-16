import java.util.Scanner;

class SumPositiveNumber {
    static void main() {
        System.out.println("welcome to sum finder");
        long sum = takeSum();
        System.out.println("sum of all number is: " + sum);
    }
    public static long takeSum(){
        Scanner input = new Scanner(System.in);
        long sum =0;
        do{
            System.out.print("enter a number: ");
            String number = input.next();
            if (number.equals("exit")){
                System.out.println("\n thanks for using");
                break;
            } else if (Integer.parseInt(number) <= 0) {
                continue;
            } else {
               sum += Integer.parseInt(number);
            }
        }
        while (true);
        return sum;
    }
}

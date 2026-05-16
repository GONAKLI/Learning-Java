import java.util.Scanner;

class RecurrsionFibonacchi {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to fibonacchi series using reccursion");
        System.out.print("enter number of fibonacchi series to be printed: ");
        int number = input.nextInt();
        for (int i =0; i < number; i++){
            System.out.println(printFibonacchi(i));
        }
    }

    public static int printFibonacchi(int number){
        if(number == 0){
            return 0;
        } else if (number == 1) {
            return 1;
        }
        return (printFibonacchi(number-2) + printFibonacchi(number - 1));

    }
}

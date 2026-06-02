import java.util.Scanner;

class FibonacchiSeries {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number to find fibonacchi: ");
        int number = input.nextInt();
        fibonacchi(number);
    }
   static void fibonacchi(int number){
        if(number <0) return;
        if(number == 0){
            System.out.println("0");
            return;
        } else if (number == 1) {
            System.out.println("0, 1");
            return;
        }
       int topPrevious = 0;
       int previous = 1;
       System.out.print("0, ");
        while (previous < number){
            if(previous == 1 || topPrevious == 0){
                System.out.print(previous + ", ");
            }else{
                System.out.print(previous + ", ");
            }

            int temp = topPrevious;
            topPrevious = previous;
            previous += temp;
        }

   }
}

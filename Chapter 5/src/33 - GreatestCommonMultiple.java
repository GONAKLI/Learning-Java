import java.util.Scanner;

class GreatestCommonMultiple {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number: ");
        int first = input.nextInt();
        System.out.print("enter second number: ");
        int second = input.nextInt();
        int result = findGcf(first, second);
        System.out.println("gcf of given number is: " + result);
    }
    static  int findGcf(int first, int second){
        long multiple = first*second;
        while (multiple >0){
            if(first % multiple == 0 && second % multiple == 0){
                return (int) multiple;
            }
            multiple--;
        }
        return 0;
    }
}

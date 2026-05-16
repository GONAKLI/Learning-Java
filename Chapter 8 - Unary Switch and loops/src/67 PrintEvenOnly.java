import java.util.Scanner;

class PrintEvenOnly {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to even world");
        System.out.print("enter the nth number: ");
        int last= input.nextInt();
        printEven(last);
    }
    public static void printEven(int last){
        for(int i = 1 ; i < last; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}

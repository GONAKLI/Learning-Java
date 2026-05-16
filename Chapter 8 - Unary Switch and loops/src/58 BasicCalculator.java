import java.util.Scanner;

class BasicCalculator {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to basic calculator\n");
        System.out.println("which operation you want to perform: \n + \t - \t * \t / \t % ");
        char operation = input.next().charAt(0);
        System.out.print("enter first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter second number: ");
        int second = input.nextInt();

        int result = switch (operation){
            case '+' -> first + second ;
            case '-' -> first - second;
            case '*' -> first * second ;
            case '/' -> first / second ;
            case '%' -> first % second ;
            default -> 0 ;
        };

        System.out.println(first + " " + operation + " " + second + " = " + result);
    }
}

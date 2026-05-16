import java.util.Scanner;

class ReadInputTillExit {
    static void main() {
        System.out.println("welcome to continuous input ");

        takeInput();
    }
    public static void takeInput(){
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("enter a number: ");
            String numberStr = input.next();
            if(numberStr.equals("exit")){
                System.out.println("good byy ...");
                break;
            }else {
                System.out.println("\t\t\t you have entered " + numberStr);

            }

        }
        while (true);
    }
}

import java.util.Scanner;

class MultiplicationByFor {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("welcome to table printer ");
        System.out.print("enter table number: ");
        int number = input.nextInt();
        MultiplicationByFor table = new MultiplicationByFor();
        table.table(number);
    }
    public void table(int num){
        for(int i = 1; i <=10; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }

    }
}

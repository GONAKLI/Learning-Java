import java.util.Scanner;

public class Challenge19 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your marks of 1 subject ");
        float marks = input.nextFloat();
        if(marks >100){
            System.out.println(" ! impossible legend");
        }
        else if (marks > 90){
            System.out.println('A');
        } else if (marks > 75) {
            System.out.println('B');
        } else if (marks > 60) {
            System.out.println('C');
        } else if (marks > 30) {
            System.out.println('D');
        } else if (marks<=30 && marks >=0) {
            System.out.println('F');
        } else {
            System.out.println("enter valid marks");
        }
    }
}

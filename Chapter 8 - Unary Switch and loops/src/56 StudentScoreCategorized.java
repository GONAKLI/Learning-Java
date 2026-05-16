import java.util.Scanner;

class StudentScoreCategorized {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to score categorized");
        System.out.print("enter your score: ");
        int score = input.nextInt();

        String category = score > 80 ? "High" : score <= 80 && score >= 50 ? "Moderate" : "Low";

        System.out.println("your score fall in:  " + category );
    }
}

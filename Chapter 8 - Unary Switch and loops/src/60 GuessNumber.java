import java.util.Scanner;

class GuessNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number guessing game ....");
        int luckNumber = (int) (Math.random() * 100);
        do {
            System.out.print("Guess the number: ");
            int number = input.nextInt();

            if ( number == luckNumber){
                System.out.println("\n  Congratulations, you guess the right number");
                break;
            } else if (number > luckNumber) {
                System.out.println("guess a smaller number please ... ");

            } else if (number < luckNumber ) {
                System.out.println("guess a higher number please ... ");

            }

        }

        while (true);

        System.out.println("Thanks for Playing the game");
    }
}

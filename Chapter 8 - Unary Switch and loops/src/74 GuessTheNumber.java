import java.util.Scanner;

class GuessTheNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        GuessTheNumber obj = new GuessTheNumber();
        int randomNumber = obj.generator();
        System.out.println("Welcome to number Guess Game ");

        int times = 0;
        do {
            System.out.print("guess the number from 1 to 1000 ");
            int userNumber = input.nextInt();
            times++;
            if(randomNumber == userNumber){
                System.out.printf("YaY, You have guessed the Number Right in %5d try", times );
                break;
            }
            if(randomNumber > userNumber){
                System.out.println("Think a higher Side");
            }
            if(randomNumber < userNumber){
                System.out.println("Think a Smaller Number ");
            }
        }
        while (true);


    }

    int generator(){
        return (int) (Math.random()*1000);
    }
}

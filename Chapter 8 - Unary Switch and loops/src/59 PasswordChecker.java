import java.util.Scanner;

class PasswordChecker {
    static void main() {
        Scanner input = new Scanner(System.in);
        String password = "Pankaj";
        String user;
        do{
            System.out.print("enter password:  ");
            user = input.nextLine();
            if(user.equals(password) ){
                System.out.println("you have successfully logged in");
                break;
            }else{
                System.out.println("Wrong password, try again...");
            }
        }
        while(true);

    }

}

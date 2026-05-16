import javax.xml.transform.Source;
import java.util.Scanner;

class ConcatenateAndUppercase {
    static void main() {

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to The String Concatenation and Uppercase");
        String first, second;
        System.out.println("enter first word");
        first = input.next();
        System.out.println("enter second word");
        second = input.next();
        System.out.printf("%S", first+second);
    }
}

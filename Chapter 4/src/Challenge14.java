import java.util.Scanner;

public class Challenge14 {
    static void main() {
        Scanner input = new Scanner(System.in);
 float fah, cal;
        System.out.println("enter temperature in fahrenite");
        fah = input.nextFloat();

        cal = (fah - 32f) * (5f/9f);

        System.out.println("temperature in calcius is " + cal);
    }
}

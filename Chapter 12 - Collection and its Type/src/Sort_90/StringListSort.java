package Sort_90;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StringListSort {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to String sortning in descending order");
        ArrayList<String> subjects = new ArrayList<>();

        do{
            System.out.print("enter your subjects and then exit: ");
            String subject = input.next();
            if(subject.equalsIgnoreCase("exit")){
                break;
            }
             subjects.add(subject);

        }while(true);
        subjects.sort(Comparator.naturalOrder());
        System.out.println("in ascending order: " + subjects);
        subjects.sort(Comparator.reverseOrder());
        System.out.println("in descending order: " + subjects);
    }
}

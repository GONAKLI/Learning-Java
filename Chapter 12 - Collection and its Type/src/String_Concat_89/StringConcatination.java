package String_Concat_89;

import java.util.Scanner;

public class StringConcatination {
    String allNames ="";
    static void main() {
        Scanner sc = new Scanner(System.in);
        StringConcatination obj = new StringConcatination();
        System.out.println("welcome to multiple string concatination");
        String name;
        do {
            System.out.print("enter Your classmate name:  ");
            name = sc.next();
            obj.concat(name);
        }while(!name.equalsIgnoreCase("exit") );
        System.out.println(obj.allNames);


    }
   public void concat(String name){

        this.allNames = this.allNames + " " + name;
   }


}

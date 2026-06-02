package Optional_112;


import java.util.Optional;
import java.util.Scanner;

public class OptionalString{
    static void main() {
        OptionalString obj = new OptionalString();
        System.out.println("welcome to optional string Use Case");
        System.out.println(obj.isString(""));
        System.out.println(obj.isString(null));
        System.out.println(obj.isString("sunny"));
    }


    Optional<String> isString(String str){
        if(str == null ||str.isEmpty()){
            return Optional.empty();
        }
       return Optional.of(str.toUpperCase());
    }
}

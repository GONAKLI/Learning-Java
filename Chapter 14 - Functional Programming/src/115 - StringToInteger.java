import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class StringToInteger {
    static void main() {
        System.out.println("welcome to string to integer and power Calculator");
        List<String> numstring = List.of("1","2","3","4","5");
        System.out.println("Old list: " + numstring);

       Optional<Integer> sum = numstring.stream()
               .map(s ->{
           int number = Integer.parseInt(s);
           return (int) Math.pow(number, 2);
        }).reduce( (a,b) -> a+b);

        System.out.println("New List Sum: " + sum.get());
    }
}

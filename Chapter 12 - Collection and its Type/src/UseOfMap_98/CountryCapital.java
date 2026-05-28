package UseOfMap_98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCapital {
    static void main() {
        Scanner input = new Scanner(System.in);
        Map<String, String> Country = new HashMap<>();

        Country.put("India", "Delhi");
        Country.put("Italy", "Rome");
        Country.put("Canada", "Otawa");
        Country.put("Spain", "Madrid");
        Country.put("Bangladesh", "Dhaka");

        System.out.println("welcome to Country capital finder");
        System.out.print("enter a country: ");
        String user = input.next();

        if(Country.containsKey(user)){
            System.out.printf("Capital of %s is: %s",user, Country.get(user));
        }
        else {
            System.out.printf("%s is not in our list", user);
        }

    }
}

package FrequencyCala_91;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyCalculator {
    static void main() {
        List<String> students = Arrays.asList("Bruce","Sam","Sam", "Peter", "Bruce", "Tony", "Sam");

        System.out.println(Collections.frequency(students, "Sam"));

        System.out.println(Collections.frequency(students, "Peter"));
        System.out.println(Collections.frequency(students, "Bruce"));
    }
}

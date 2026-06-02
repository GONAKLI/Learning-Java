import java.util.ArrayList;
import java.util.List;

class StringOfStream {
    static void main() {
        System.out.println("welcome to String With stream");
        List<String> students = List.of("Sanjay", "Sanju", "Ajay", "Rakesh", "Tonny",
                "Peter", "John", "Hulk", "Shaktiman");

        students.stream().forEach(studName ->
                System.out.println("Student in Class are: " + studName));
    }
}

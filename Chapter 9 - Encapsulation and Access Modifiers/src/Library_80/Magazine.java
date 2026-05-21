package Library_80;

public class Magazine extends LibraryItem{
    private String issueNumber;

    static void main() {
        Magazine obj = new Magazine();
        obj.title = "Goa trip";

        System.out.println(obj.title);
    }
}

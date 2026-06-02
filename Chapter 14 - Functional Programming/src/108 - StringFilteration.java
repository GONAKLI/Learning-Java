import java.util.List;

class StringFilteration {
    static void main() {
        System.out.println("welcome to string filteration on the basis of length");

        List<String> tvShows = List.of("Hulk", "Shaktiman", "Doraemon", "kitrekshu",
                "Robotan", "Ninja Hatori", "Batman and Robotan");

        tvShows.stream().filter(
                s  -> s.length() >= 10
        ).forEach((s)->
                System.out.print(s + ", "));
    }
}

package String_Concat_89;

public class Way2nd {
    static void main() {
        Way2nd obj = new Way2nd();
        String names = obj.concat("Sam", "Peter", "bruce", "tony", "Anuj");
        System.out.println(names);
    }

    String concat(String... name){
        StringBuilder allNames = new StringBuilder();
        for(String obj : name){
            allNames.append(obj).append(" ");
        }
        return allNames.toString();
    }
}

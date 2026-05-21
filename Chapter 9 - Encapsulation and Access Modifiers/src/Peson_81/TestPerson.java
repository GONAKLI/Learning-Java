package Peson_81;

public class TestPerson {
    static void main() {
        Person p1 = new Person("Rakesh", 25);
        Person p2 = new Person("Vijay", 35);
        Person p3 = new Person("Rakesh", 25);

        System.out.println(p1.equals(p3));
        System.out.println(p1.hashCode());

        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

    }
}

package in.employee79;

public class PersonEmployed {
    static void main() {
        Employee p1 = new Employee("Rakesh", 35, 25000);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getSalary());
        p1.setSalary(84000);
        p1.setAge(38);

        System.out.println(p1.getAge());
        System.out.println(p1.getSalary());

         p1.empDetail();
    }
}

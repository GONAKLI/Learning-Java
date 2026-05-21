package in.employee79;

public class Employee {
    final private String name;
    private int age;
    private int salary;

    Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;

    }
public String getName(){
    return this.name;
}
public int getAge(){
        return this.age;
}
public int getSalary(){
        return salary;
}

public void setAge(int age){
        if(age>0){
            this.age = age;
            System.out.println("Age has been updated ");
        }
}

    public void setSalary(int salary) {
        this.salary = salary;
        System.out.println("salary has been updated");
    }

    void empDetail(){
        System.out.printf("%S is our employee having age of %d in our company.\n" +
                "we give salary of %d per month", this.name, this.age, this.salary);
    }

}

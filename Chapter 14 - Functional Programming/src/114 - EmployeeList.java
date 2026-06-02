import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employ<String,Integer> {
   final String name;
  final int salary;
  public Employ(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public java.lang.String toString() {
        return this.name + ": " + this.salary;
    }
}

class EmployeeList {
    static void main() {
        List<Employ> emp = new ArrayList<>();
        emp.add(new Employ("Ramesh", 950));
        emp.add(new Employ("Suresh", 170));
        emp.add(new Employ("Nitin", 800));

        emp.add(new Employ("Triya", 5));

        List sam = emp.stream().sorted(new Comparator<Employ>() {
            @Override
            public int compare(Employ o1, Employ o2) {
                return Integer.compare(o1.salary, o2.salary);
            }
        }).toList();
        System.out.println(sam);


    }
}

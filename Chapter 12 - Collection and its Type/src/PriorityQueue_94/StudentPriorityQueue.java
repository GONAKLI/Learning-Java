package PriorityQueue_94;

import java.util.*;

public class StudentPriorityQueue {
   public static void main() {
       PriorityQueue<Student> students = new PriorityQueue<>(new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return o1.getGrade() - o2.getGrade();
           }
       });
       students.offer(new Student("rakesh", 'f'));
       students.offer(new Student("dinesh", 'a'));
       students.offer(new Student("tarsem", 'c'));
       students.offer(new Student("ajay", 'a'));
       students.offer(new Student("tarsem", 'f'));

       System.out.println(students);


    }

    private static class Student{
       private  final String name;
       private final char grade;

       Student(String name, char grade){
           this.name = name;
           this.grade = grade;
       }

       public char getGrade(){
           return grade;
       }

        @Override
        public String toString() {
           StringBuilder msg = new StringBuilder();
           msg.append(this.name);
           msg.append(" Grade: ");
           msg.append(this.grade);
            return msg.toString();
        }
    }
}

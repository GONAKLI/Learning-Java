package PriorityQueue_94;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Students {
   public static void main() {
        Queue<Grade>  marks = new PriorityQueue<>();
        marks.add(new Grade("rakesh", 'B'));

        marks.add(new Grade("peter", 'A'));
        marks.add(new Grade("Tony", 'F'));

       // Collections.sort(marks, (s1,s2) -> Character.compare(s1.grade, s2.grade));

    }
     static class Grade{
        char grade;
        String name;

        Grade(String name, char grade){
            this.name = name;
            this.grade = grade;
        }
    }
}

class Course {
    String courseName;
    boolean enrolledStudents;
    static int maxCapacity;

    static{
        maxCapacity =5;
    }

    public void enrollStudent(String name){
        System.out.println("student has been enrolled in this course: " + name);
        this.courseName = name;
        this.enrolledStudents = true;
    }
    public void unEnrolledStudent(String name){
        System.out.println(name + " has been removed from this course ");
        this.courseName ="";
        this.enrolledStudents = false;
    }

    public static void setMaxCapacity(int capacity){
        Course.maxCapacity = capacity;
        System.out.println("max capacity has been set to: " + maxCapacity);

    }
}

class Student {
    String name = "Rakesh";
    int marks = 85;

    @Override
    public String toString() {
        return "Name: " + this.name + "\nMarks: " + this.marks;
    }

    static void main() {
        System.out.println("welcome to the use of toString() function in a class ");
    Student obj = new Student();
        System.out.println(obj.toString());

    }
}

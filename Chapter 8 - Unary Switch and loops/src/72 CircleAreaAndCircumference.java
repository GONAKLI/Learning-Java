import java.util.Scanner;

class CircleAreaAndCircumference {
    static void main() {
        Scanner input = new Scanner(System.in);
       double PI =  Math.PI;
        System.out.println("welcome to area and circumference of a circle finder...");
        System.out.print("enter radius of a circle: ");
        double radius = input.nextDouble();

        System.out.println("area of circle is: " + PI*Math.pow(radius,2));
        System.out.println("circumference of circle is: " + 2 * PI * radius);
    }
}

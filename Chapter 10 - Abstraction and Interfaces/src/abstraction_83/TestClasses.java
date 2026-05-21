package abstraction_83;

import java.util.Scanner;

public class TestClasses {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to test circle and radius classes");
        System.out.print("enter radius of a circle: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.print("now, enter side of a square: ");
        double side = input.nextDouble();
        Square square = new Square(side);

        System.out.printf("Area of circle is: %f", circle.calculateArea());
        System.out.printf("%n Area of Square is: %f", square.calculateArea());
    }
}

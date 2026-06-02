import java.util.Scanner;

class PerimeterOfRectangle {
    static void main() {
        Scanner input = new Scanner(System.in);
         float a,b,c,d;
        System.out.println("welcome to rectangle Perimeter finder");
        System.out.println("enter 1st side of rectangle ");
        a = input.nextFloat();
        System.out.println("enter 2nd side of rectangle ");
        b = input.nextFloat();
        System.out.println("enter 3rd side of rectangle ");
        c = input.nextFloat();
        System.out.println("enter 4th side of rectangle ");
        d = input.nextFloat();

        System.out.println("perimeter of rectangle is : " + (a+b+c+d));
    }
}

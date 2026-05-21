package com.example77.utils;

import com.example77.geometry.Circle;
import com.example77.geometry.Rectangle;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to our calculator ");
        System.out.print("which Shape area you want to find - rectangle or circle:  ");
        String shape = input.next();
        if(shape.equalsIgnoreCase("circle")){
            Circle circle = new Circle();
            System.out.print("enter radius of circle: ");
            float radius = input.nextFloat();
            double areaOfCircle = circle.Area(radius);
            System.out.println("area of circle is: " + areaOfCircle);
        } else if (shape.equalsIgnoreCase("rectangle")) {
            Rectangle rectangle = new Rectangle();
            System.out.print("enter length of rectangle: ");
            float length = input.nextFloat();
            System.out.print("nnow enter Breadth of rectangle: ");
            float breadth = input.nextFloat();
            double areaOfRectangle = rectangle.Area(length,breadth);
            System.out.println("area of rectangle is: " + areaOfRectangle);
            
        }else {
            System.out.println("you have entered an invalid choice");
        }
        System.out.println("Thanks for using our calculator ");
    }

}

package abstraction_83;

public class Square extends Shape {
    private double side;
    public Square(double side){
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }
}

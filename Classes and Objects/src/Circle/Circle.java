package Circle;

public class Circle {
    // Declare private instance variables
    private double radius;

    // Declare public constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){
        this.radius = 1.0;
    }

    // Declare public method to calculate and return the area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Declare public method to calculate and return the Parameters
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Declare public method to set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void display(){
        System.out.println("\nHello World");
    }
}


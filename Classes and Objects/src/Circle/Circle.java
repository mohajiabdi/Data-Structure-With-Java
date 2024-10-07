package Circle;

public class Circle {
    // Declare private instance variables
    private double radius;
    private static int numOfObjects;

    // Declare public constructor
    public Circle(double radius) {
        this.radius = radius;
        numOfObjects++;
    }
    public Circle(){
//        this.radius = 1.0;

        this(10);
        numOfObjects++;
    }

    // Declare public method to calculate and return the area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //getters and setters


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getNumOfObjects() {
        return numOfObjects;
    }

    @Override
    public String toString() {
        return "\n\nCircle: " +
                "\tRadius= " + radius+
                "\n\t\t\tNumber Of Objects= " + numOfObjects;
    }
}


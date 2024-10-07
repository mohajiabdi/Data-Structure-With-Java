package Circle;

public class Main {
    public static void main(String[] args) {

        // Create a Circle object with radius 5
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(6);
        Circle c3 = new Circle();

        System.out.println();
        // Print  circle
        printCircle(c1);
        printCircle(c2);
        printCircle(c3);




    }

    public static void printCircle(Circle c){
        System.out.println("\n----------------------------------------------------");
        System.out.printf("\nThe area of the circle is %.2f" , c.getArea());
        System.out.printf("\nThe getRadius of the circle is %.2f" , c.getRadius());
        System.out.println(c.toString());
    }
}
package Circle;

public class Main {
    public static void main(String[] args) {

        // Create a Circle object with radius 5
        Circle circle = new Circle();

        // Print the area of the circle
        circle.setRadius(3);
        System.out.printf("\nThe area of the circle is %.4f" , circle.getArea());
        System.out.printf("\nThe Perimeter of the circle is %.4f" , circle.getPerimeter());

        circle.display();
    }
}
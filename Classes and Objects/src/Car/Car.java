package Car;

public class Car {
    // Datafields
    String name;
    double price;
    int wheels;
    static int totalCars;

    //Constructor with parameters
    public Car(String name, double price, int wheels){
        this.name = name;
        this.price = price;
        this.wheels = wheels;
        totalCars++;
    }

    //Methods
    public void displayDetails(){
        System.out.println("Name: " + name + "\nPrice: " + price + "\nWheels: " + wheels);
    }

    public static int getTotalCars(){
        return totalCars;
    }
}

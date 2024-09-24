package Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota",1150,100);
        Car car2 = new Car("Probox",1200,120);
        Car car3 = new Car("Coaster",2000,20);
        Car car4 = new Car("Noah",800,200);

        Car[] cars ={car1,car2,car3,car4};

        for (int i = 0; i < cars.length; i++){
            System.out.println("Car"+ (i+1)+" :");
            cars[i].displayDetails();
            System.out.println("\n");

        }

        System.out.println("Total Types of Cars are: "+Car.getTotalCars());
        System.out.println("Total Types of Cars are: "+Car.totalCars);

    }
}

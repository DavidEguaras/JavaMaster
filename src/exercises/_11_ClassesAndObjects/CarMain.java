package exercises._11_ClassesAndObjects;

public class CarMain {
    public static void main(String[] args) {
        // Creating a car dealership with a maximum of 5 cars on display
        CarDealership dealership = new CarDealership("XYZ Auto", 5);

        // Counting the number of cars initially
        System.out.println("Number of cars initially: " + dealership.getCarsInStockCount());

        // Adding a new car to the dealership
        dealership.addCarToStock(new Car("Toyota", 25000.0, Car.EngineType.PETROL));

        // Counting the number of cars after adding a new car
        System.out.println("Number of cars after adding a new car: " + dealership.getCarsInStockCount());

        //Find a car in the dealership's carsInStock based on the manufacturers
        System.out.println("Car in the dealership which manufacturer is Toyota" + dealership.findCarByManufacturer("Toyota"));

    }
}

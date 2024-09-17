package exercises._11_ClassesAndObjects;

import exercises._11_ClassesAndObjects.Car.EngineType;

public class CarDealership {
    // Properties
    private String name;
    private int maxCarsOnDisplay;
    private Car[] carsInStock; // Using an array to represent cars in stock

    // Constructor
    public CarDealership(String name, int maxCarsOnDisplay) {
        this.name = name;
        this.maxCarsOnDisplay = maxCarsOnDisplay;
        this.carsInStock = new Car[maxCarsOnDisplay];
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for maxCarsOnDisplay
    public int getMaxCarsOnDisplay() {
        return maxCarsOnDisplay;
    }

    // Getter for carsInStock array
    public Car[] getCarsInStock() {
        return carsInStock;
    }

    // Method to add a car to the dealership's stock
    public void addCarToStock(Car car) {
        int currentStockSize = getCarsInStockCount();
        if (currentStockSize < maxCarsOnDisplay) {
            carsInStock[currentStockSize] = car;
            System.out.println(car.getManufacturer() + " " + car.getEngineType() + " car added to stock.");
        } else {
            System.out.println("Sorry, the maximum capacity of cars on display has been reached.");
        }
    }

    // Method to get the current count of cars in stock
    public int getCarsInStockCount() {
        int count = 0;
        for (Car car : carsInStock) {
            if (car != null) {
                count++;
            }
        }
        return count;
    }

    //Method to find cars based on the manufacturer
    //returns the first Car the dealership has in stock with a manufacturer property matching the value passed to the method.
    public Car findCarByManufacturer(String manufacturer){
        for(Car car : carsInStock){
            if(car != null && car.getManufacturer().equalsIgnoreCase(manufacturer)){
                return car;
            }
        }
        return null;
    }

}

























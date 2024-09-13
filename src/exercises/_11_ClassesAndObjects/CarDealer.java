package exercises._11_ClassesAndObjects;

import java.util.Arrays;

public class CarDealer {
    private String name;
    private int maxCarsOnDisplay;
    private Car[] carsInStock;

    public CarDealer(String name, int maxCarsOnDisplay, Car[] cars) {
        this.name = name;
        this.maxCarsOnDisplay = maxCarsOnDisplay;
        this.carsInStock = cars;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCarsOnDisplay() {
        return maxCarsOnDisplay;
    }

    public void setMaxCarsOnDisplay(int maxCarsOnDisplay) {
        this.maxCarsOnDisplay = maxCarsOnDisplay;
    }

    public Car[] getCars() {
        return carsInStock;
    }

    public void setCars(Car[] cars) {
        this.carsInStock = cars;
    }

    @Override
    public String toString() {
        return "CarDealer{" +
                "name='" + name + '\'' +
                ", maxCarsOnDisplay=" + maxCarsOnDisplay +
                ", cars=" + Arrays.toString(carsInStock) +
                '}';
    }

}

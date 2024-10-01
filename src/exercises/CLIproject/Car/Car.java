package exercises.CLIproject.Car;

import exercises.CLIproject.CarManufacturer;
import exercises.CLIproject.EngineType;

public class Car{
    private int id;
    private CarManufacturer manufacturer;
    private String model;
    private double pricePerDayRented;
    private EngineType engineType;
    private boolean available;

    public Car(int id, CarManufacturer manufacturer, String model, double pricePerDayRented, EngineType engineType, boolean available) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.pricePerDayRented = pricePerDayRented;
        this.engineType = engineType;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CarManufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(CarManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPricePerDayRented() {
        return pricePerDayRented;
    }

    public void setPricePerDayRented(double pricePerDayRented) {
        this.pricePerDayRented = pricePerDayRented;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", manufacturer=" + manufacturer +
                ", model='" + model + '\'' +
                ", pricePerDayRented=" + pricePerDayRented +
                ", engineType=" + engineType +
                ", available=" + available +
                '}';
    }
}

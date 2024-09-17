package exercises._11_ClassesAndObjects;
public class Car {
    // Properties
    private String manufacturer;
    private double price;
    private EngineType engineType; // Modify the data type to EngineType enum

    // EngineType enum
    public enum EngineType {
        PETROL, ELECTRIC, DIESEL, HYBRID
    }

    // Constructor
    public Car(String manufacturer, double price, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

    // Getters
    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    // Setters
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    // toString method to represent Car object as a string
    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", engineType=" + engineType +
                '}';
    }

    // Example of main method to test the Car class
    public static void main(String[] args) {
        // Creating a car object with EngineType.ELECTRIC
        Car myCar = new Car("Tesla", 75000.0, EngineType.ELECTRIC);

        // Using setters to modify car properties
        myCar.setManufacturer("Nissan");
        myCar.setPrice(32000.0);
        myCar.setEngineType(EngineType.HYBRID);

        // Printing modified car details using the getters
        System.out.println("My car details after modification:");
        System.out.println("Manufacturer: " + myCar.getManufacturer());
        System.out.println("Price: " + myCar.getPrice());
        System.out.println("Engine Type: " + myCar.getEngineType());
    }
}
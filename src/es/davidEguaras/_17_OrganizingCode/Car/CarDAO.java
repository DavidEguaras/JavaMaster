package es.davidEguaras._17_OrganizingCode.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDAO {
    private List<Car> cars = new ArrayList<>();

    // Add car to the list
    public void addCar(Car car) {
        cars.add(car);
    }

    // Get car by ID
    public Car getCarById(int id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    // Get all cars
    public List<Car> getAllCars() {
        return cars;
    }

    // Remove car by ID
    public void removeCar(int id) {
        cars.removeIf(car -> car.getId() == id);
    }
}

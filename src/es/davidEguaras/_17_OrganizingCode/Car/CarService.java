package es.davidEguaras._17_OrganizingCode.Car;

import java.util.List;

public class CarService {
    private CarDAO carDAO = new CarDAO();

    // Business logic to add a car
    public void addCar(int id, String make, String model, int year) {
        Car car = new Car(id, make, model, year);
        carDAO.addCar(car);
    }

    // Business logic to retrieve car by ID
    public Car getCar(int id) {
        return carDAO.getCarById(id);
    }

    // Business logic to retrieve all cars
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }

    // Business logic to remove a car
    public void removeCar(int id) {
        carDAO.removeCar(id);
    }
}

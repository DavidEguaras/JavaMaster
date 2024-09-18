package es.davidEguaras._17_OrganizingCode;

import es.davidEguaras._17_OrganizingCode.Car.Car;
import es.davidEguaras._17_OrganizingCode.Car.CarService;
import es.davidEguaras._17_OrganizingCode.Garage.Garage;
import es.davidEguaras._17_OrganizingCode.Garage.GarageService;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        carService.addCar(1, "Toyota", "Corolla", 2020);
        carService.addCar(2, "Honda", "Civic", 2019);

        System.out.println("All cars:");
        for (Car car : carService.getAllCars()) {
            System.out.println(car);
        }

        GarageService garageService = new GarageService();
        garageService.addGarage(1, "Downtown", 50);
        garageService.addGarage(2, "Uptown", 100);

        System.out.println("All garages:");
        for (Garage garage : garageService.getAllGarages()) {
            System.out.println(garage);
        }
    }
}


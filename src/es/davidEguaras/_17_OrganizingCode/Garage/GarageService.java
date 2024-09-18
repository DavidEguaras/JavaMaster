package es.davidEguaras._17_OrganizingCode.Garage;

import java.util.List;

public class GarageService {
    private GarageDAO garageDAO = new GarageDAO();

    // Business logic to add a garage
    public void addGarage(int id, String location, int capacity) {
        Garage garage = new Garage(id, location, capacity);
        garageDAO.addGarage(garage);
    }

    // Business logic to retrieve garage by ID
    public Garage getGarage(int id) {
        return garageDAO.getGarageById(id);
    }

    // Business logic to retrieve all garages
    public List<Garage> getAllGarages() {
        return garageDAO.getAllGarages();
    }

    // Business logic to remove a garage
    public void removeGarage(int id) {
        garageDAO.removeGarage(id);
    }
}

package es.davidEguaras._17_OrganizingCode.Garage;

import java.util.ArrayList;
import java.util.List;

public class GarageDAO {
    private List<Garage> garages = new ArrayList<>();

    // Add garage to the list
    public void addGarage(Garage garage) {
        garages.add(garage);
    }

    // Get garage by ID
    public Garage getGarageById(int id) {
        for (Garage garage : garages) {
            if (garage.getId() == id) {
                return garage;
            }
        }
        return null;
    }

    // Get all garages
    public List<Garage> getAllGarages() {
        return garages;
    }

    // Remove garage by ID
    public void removeGarage(int id) {
        garages.removeIf(garage -> garage.getId() == id);
    }
}

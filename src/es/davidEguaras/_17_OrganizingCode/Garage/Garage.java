package es.davidEguaras._17_OrganizingCode.Garage;

public class Garage {
    private int id;
    private String location;
    private int capacity;

    public Garage(int id, String location, int capacity) {
        this.id = id;
        this.location = location;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Garage [id=" + id + ", location=" + location + ", capacity=" + capacity + "]";
    }
}


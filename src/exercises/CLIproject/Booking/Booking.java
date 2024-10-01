package exercises.CLIproject.Booking;

import exercises.CLIproject.Car.Car;
import exercises.CLIproject.User.User;

import java.util.Date;

public class Booking {
    private int id;
    private Date startDate;
    private Date endDate;
    private int userID;
    private int carID;

    public Booking(int id, Date startDate, Date endDate, int userID, int carID) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.userID = userID;
        this.carID = carID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }
}


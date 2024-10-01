package exercises.CLIproject.Booking;

import exercises.CLIproject.Car.Car;
import exercises.CLIproject.User.User;

import java.util.Date;

public class Booking {

    public static Booking[] bookings = new Booking[500];

    private int id;
    private Date startDate;
    private Date endDate;
    private User user;
    private Car car;

    public Booking(int id, Date startDate, Date endDate, User user, Car car) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.user = user;
        this.car = car;
    }

    public static Booking[] getBookings() {
        return bookings;
    }

    public static void setBookings(Booking[] bookings) {
        Booking.bookings = bookings;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", user=" + user +
                ", car=" + car +
                '}';
    }
}


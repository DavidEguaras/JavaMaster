package exercises.CLIproject.User;

import exercises.CLIproject.Booking.Booking;

import java.awt.print.Book;
import java.util.Arrays;

public class User {
    public static int userCount = 0;
    private int id;
    private String name;
    private String lastName;
    private String email;
    private Booking[] bookings = new Booking[10];
    private int bookingCount = 0;


    public User(String name, String lastName, String email) {
        this.id = userCount++;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Booking[] getBookings() {
        return bookings;
    }

    public void setBookings(Booking[] bookings) {
        this.bookings = bookings;
    }

    public int getBookingCount() {
        return bookingCount;
    }

    public void setBookingCount(int bookingCount) {
        this.bookingCount = bookingCount;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", bookings=" + Arrays.toString(bookings) +
                '}';
    }
}


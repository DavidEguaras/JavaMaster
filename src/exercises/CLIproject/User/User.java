package exercises.CLIproject.User;

import exercises.CLIproject.Booking.Booking;

import java.awt.print.Book;
import java.util.Arrays;

public class User {

    private int id;
    private String name;
    private String lastName;
    private String email;
    private Booking[] bookings = new Booking[10];

    public User(int id, String name, String lastName, String email, Booking[] bookings) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.bookings = bookings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


package exercises.CLIproject.Booking;

public class BookingDAO {
    public static Booking[] bookings = new Booking[100];
    private static int bookingCount = 0;


    public boolean addBooking (Booking booking){
        if(bookingCount < bookings.length){
            bookings[bookingCount] = booking;
            bookingCount++;
            return true;
        }else{
            System.out.println("The booking array is full");
            return false;
        }
    }

    public Booking[] getAllBookings(){
        Booking[] allBookings = new Booking[bookingCount];
        for(int i = 0; i < bookingCount; i++){
            allBookings[i] = bookings[i];
        }
        return allBookings;
    }


}

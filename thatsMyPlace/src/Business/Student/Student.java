package Business.Student;

import Business.Booking.Booking;
import Business.Booking.BookingHistory;
import Business.Employee.Employee;

/**
 *
 * @author bboysticker
 */
public class Student extends Employee {
    
    private BookingHistory bookingHistory;
    private String email;
    
    public Student(){
        super();
        bookingHistory = new BookingHistory();
    }
    
    public Student(String email) {
        super();
        bookingHistory = new BookingHistory();
        this.email = email;
    }
    public BookingHistory getBookingHistory() {
        return bookingHistory;
    }
    
    public void addBooking(Booking booking) {
        bookingHistory.getBookingHistory().add(booking);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

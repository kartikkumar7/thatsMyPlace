/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Booking;

import java.util.ArrayList;

/**
 *
 * @author bboysticker
 */
public class BookingHistory {
    
    private ArrayList<Booking> bookingHistory;
    
    public BookingHistory() {
        bookingHistory = new ArrayList<>();
    }
    
    public ArrayList<Booking> getBookingHistory() {
        return bookingHistory;
    }
    
    public void addBooking(Booking booking) {
        bookingHistory.add(booking);
    }
    public int totalConfirmed(){
        int count = 0;
        for(Booking b: bookingHistory){
            if(b.getStatus().equals(Booking.Status.Confirmed)){
                count++;
            }
        }    
        return count;
    }
    
    public int totalClosed(){
        int count = 0;
        for(Booking b: bookingHistory){
            if(b.getStatus().equals(Booking.Status.Closed)){
                count++;
            }
        }    
        return count;
    }
    public int totalNoShow(){
        int count = 0;
        for(Booking b: bookingHistory){
            if(b.getStatus().equals(Booking.Status.NoShow)){
                count++;
            }
        }    
        return count;
    }
    public int totalCanceled(){
        int count = 0;
        for(Booking b: bookingHistory){
            if(b.getStatus().equals(Booking.Status.Canceled)){
                count++;
            }
        }    
        return count;
    }
}

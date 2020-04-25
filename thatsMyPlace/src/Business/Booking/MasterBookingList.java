/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Booking;

import Business.WorkQueue.FeedbackWorkRequest;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author bboysticker
 */
public class MasterBookingList {
    
    private ArrayList<Booking> masterBookingList;
    private HashMap<Booking, Boolean> bookingFeedbackMapping;
    
    public MasterBookingList() {
        masterBookingList = new ArrayList<>();
        bookingFeedbackMapping = new HashMap<>();
    }
    
    public void addBooking(Booking booking) {
        masterBookingList.add(booking);
        bookingFeedbackMapping.put(booking, false);
    }
    
    public ArrayList<Booking> getMasterBookingList() {
        return masterBookingList;
    }
    
    public boolean isGivenFeedback(Booking booking) {
        return bookingFeedbackMapping.get(booking);
    }
    
    public void markGivenFeedback(Booking booking, boolean b) {
        bookingFeedbackMapping.put(booking, b);
    }
    
}

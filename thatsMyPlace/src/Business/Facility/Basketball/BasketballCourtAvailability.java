package Business.Facility.Basketball;

import Business.Facility.FacilityAvailability;
import java.time.LocalDate;

/**
 *
 * @author bochao
 */
public class BasketballCourtAvailability extends FacilityAvailability{
   
    private int courtNo;
    private LocalDate date;
    private int starTime;
    private int endTime;
    private boolean isAvailability;
    
    public BasketballCourtAvailability(int courtNo, LocalDate date, int starTime, int endTime, boolean isAvailability){
        this.courtNo = courtNo;
        this.date = date;
        this.starTime = starTime;
        this.endTime = endTime;
        this.isAvailability = isAvailability;
    }
    
    public void change(boolean b){
        isAvailability = b;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getCourtNo() {
        return courtNo;
    }

    @Override
    public String toString(){
        return "" + starTime;
    }

    public int getStarTime() {
        return starTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public boolean isIsAvailability() {
        return isAvailability;
    }
    
}

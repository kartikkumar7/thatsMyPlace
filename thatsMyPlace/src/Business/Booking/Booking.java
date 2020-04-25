package Business.Booking;

import Business.Facility.Facility;
import Business.Student.Student;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 *
 * @author bboysticker
 * @author bochao
 */
public class Booking {
    
    public enum Status {
        Confirmed("Confirmed"),
        Closed("Closed"),
        NoShow("No Show"),
        Canceled("Canceled");
        
        private String value;
        private Status(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }
    
    // Booking details
    private static int id = 1;
    private Student registrant;
    private LocalDateTime submittedDate;
    private String message;
    private Status status;
    private Facility facility;
    
    // Court details
    private int courtId;
    private LocalDate date;
    private int beginTime;
    private int endTime;
    
    public Booking(Student student, int courtId, LocalDate date, int beginTime, int endTime) {
        // Default attributes
        status = Status.Confirmed;
        id ++;
        submittedDate = LocalDateTime.now();
        
        this.registrant = student;
        this.courtId = courtId;
        this.date = date;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }
    
    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public int getId() {
        return id;
    }

    public Student getRegistrant() {
        return registrant;
    }

    public LocalDateTime getSubmittedDate() {
        return submittedDate;
    }

    public String getMessage() {
        return message;
    }

    public Status getStatus() {
        return status;
    }

    public void setRegistrant(Student registrant) {
        this.registrant = registrant;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    public Facility getFacility() {
        return facility;
    }

    public int getCourtId() {
        return courtId;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getBeginTime() {
        return beginTime;
    }

    public int getEndTime() {
        return endTime;
    }

    @Override
    public String toString(){
        //return "NewBooking:\nstudent name: " + studentName + " courtId "+ courtId + " date "+ date.toString()+ " beginTime "+ beginTime+ " endTime "+ endTime;
        return ""+beginTime;      
    }
}
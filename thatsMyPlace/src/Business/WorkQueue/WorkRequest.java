package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author bboysticker
 */
public abstract class WorkRequest {
    
    public enum Type {
        FeedbackRequest("Feedback Request"),
        FeedbackResponse("Feedback Response"),
        FeedbackToMaintanence("Feedback To Maintanence");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }
    
    public enum Status {
        Unsloved("Unsloved"),
        Pending("Pending"),
        Solved("Solved");
        
        private String value;
        private Status(String value) {
            this.value = value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }
    
    private int id;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private Status status;
    private Type type;
    private Date requestDate;
    private Date resolveDate;
    
    public WorkRequest(Type type){
        this.type = type;
        requestDate = new Date();
        status = Status.Unsloved;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return Integer.toString(id);
    }
    
}

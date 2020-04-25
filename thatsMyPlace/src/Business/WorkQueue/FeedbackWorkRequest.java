package Business.WorkQueue;

/**
 *
 * @author bboysticker
 */
public class FeedbackWorkRequest extends WorkRequest {

    private String messageToMaintanence;
    private String rating;
    
    public FeedbackWorkRequest() {
        super(Type.FeedbackRequest);
    }

    public String getMessageToMaintanence() {
        return messageToMaintanence;
    }

    public void setMessageToMaintanence(String messageToMaintanence) {
        this.messageToMaintanence = messageToMaintanence;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    
}

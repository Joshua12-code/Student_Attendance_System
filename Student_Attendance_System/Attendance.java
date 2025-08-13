public class Attendance {
    private String subject;
    private String date;
    private String status;
    private String markedBy; 
    
    public Attendance(String subject, String date, String status, String markedBy) {
        this.subject = subject;
        this.date = date;
        this.status = status;
        this.markedBy = markedBy;
    }

    public String getSubject() {
        return subject;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public String getMarkedBy() {
        return markedBy;
    }
}

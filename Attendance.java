public class Attendance {
    private String subject;
    private String date;
    private String isPresent;

    public Attendance(String subject, String date, String isPresent) {
        this.subject = subject;
        this.date = date;
        this.isPresent = isPresent;
    }

    
    public String getSubject() {
         return subject; 
        }
    public String getDate() {
         return date; 
        }
    public String isPresent() {
         return isPresent;
         }
}

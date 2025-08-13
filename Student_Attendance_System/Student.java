import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private List<Attendance> attendanceList;

    public Student(int id, String name) {
        super(id, name); 
        this.attendanceList = new ArrayList<>();
    }

    public void addAttendance(String subject, String date, String status, String markedBy) {
        attendanceList.add(new Attendance(subject, date, status, markedBy));
    }

    public List<Attendance> getAttendanceList() {
        return attendanceList;
    }
}

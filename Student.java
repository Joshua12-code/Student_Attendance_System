import java.util.*;

public class Student {
    private int studentId;
    private String studentName;
    private List<Attendance> attendanceList;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.attendanceList = new ArrayList<>();
    }

    public void addAttendance(String subject, String date, String isPresent) {
        Attendance attendance = new Attendance(subject, date, isPresent);
        attendanceList.add(attendance);
    }

    public int getStudentId() {
         return studentId; 
        }
    public String getStudentName() {
         return studentName; 
        }
    public List<Attendance> getAttendanceList() {
         return attendanceList; 
        }
}

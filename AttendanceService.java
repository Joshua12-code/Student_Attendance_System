
import java.util.HashMap;
import java.util.Map;

public class AttendanceService {
    private Map<Integer, Student> studentMap = new HashMap<>();
    

    public void addStudent(int id , String name){
        if (studentMap.containsKey(id)) {
            System.out.println("Student already exists");
        return;
        }
        studentMap.put(id, new Student(id,name));
        System.out.println("Student added successfully");
    }

    public void markAttendance(int id , String subject, String date , String status){
        if(studentMap.containsKey(id)){
            studentMap.get(id).addAttendance(subject, date, status);
        }else{
            System.out.println(" student does not exists");
        }
    }

   public void getStudentByID(int id) {
    if (studentMap.containsKey(id)) {
        Student student = studentMap.get(id);
        System.out.println("Name: " + student.getStudentName());
        System.out.println("Attendance:");
        for (Attendance att : student.getAttendanceList()) {
            System.out.println("  Date: " + att.getDate() + ", Subject: " + att.getSubject() + ", Present: " + att.isPresent());
        }
    } else {
        System.out.println("Student with ID " + id + " not found.");
    }
}

public void showReport() {
        for (Student student : studentMap.values()) {
            System.out.println("Student: " + student.getStudentName() + " (ID: " + student.getStudentId() + ")");
            for (Attendance att : student.getAttendanceList()) {
                System.out.println("  Date: " + att.getDate() + ", Subject: " + att.getSubject() +
                        ", Present: " + att.isPresent());
            }
            System.out.println();
        }

}

}
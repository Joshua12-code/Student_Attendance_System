import java.util.HashMap;
import java.util.Map;

public class AttendanceService {

    private Map<Integer, Student> studentMap = new HashMap<>();
    private Map<Integer, Teacher> teacherMap = new HashMap<>();

    public void addStudent(int id, String name) {
        if (studentMap.containsKey(id)) {
            System.out.println("Student already exists.");
            return;
        }
        studentMap.put(id, new Student(id, name));
        System.out.println("Student added successfully.");
    }

    public boolean studentExists(int id) {
        return studentMap.containsKey(id);
    }

    public int getNumberOfStudents(){
        return studentMap.size();
    }
    public void addTeacher(int id, String name, String subjectSpecialization) {
        if (teacherMap.containsKey(id)) {
            System.out.println("Teacher already exists.");
            return;
        }
        teacherMap.put(id, new Teacher(id, name, subjectSpecialization));
        System.out.println("Teacher logged in successfully.");
    }

    public void markAttendanceByTeacher(int teacherId, int studentId, String subject, String date, String status) {
        Teacher teacher = teacherMap.get(teacherId);
        Student student = studentMap.get(studentId);

        if (teacher == null) {
            System.out.println("Teacher not found.");
            return;
        }
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        student.addAttendance(subject, date, status, teacher.getName());
    }

    public void getStudentById(int id) {
        Student student = studentMap.get(id);
        if (student == null) {
            System.out.println("Student with ID " + id + " not found.");
            return;
        }

        System.out.println("Name: " + student.getName());
        System.out.println("Attendance:");
        for (Attendance att : student.getAttendanceList()) {
            System.out.println("  Date: " + att.getDate() +
                    ", Subject: " + att.getSubject() +
                    ", Status: " + att.getStatus() +
                    ", Marked by: " + att.getMarkedBy());
        }
    }

    public void showReport() {
        for (Student student : studentMap.values()) {
            System.out.println("Student: " + student.getName() + " (ID: " + student.getId() + ")");
            for (Attendance att : student.getAttendanceList()) {
                System.out.println("  Date: " + att.getDate() +
                        ", Subject: " + att.getSubject() +
                        ", Status: " + att.getStatus() +
                        ", Marked by: " + att.getMarkedBy());
            }
            System.out.println();
        }
    }
}

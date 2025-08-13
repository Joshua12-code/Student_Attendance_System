import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AttendanceService service = new AttendanceService();
        Scanner sc = new Scanner(System.in);

        int loggedInTeacherId = -1;
        String loggedInSubject = "";
        String attendanceDate = "";
        boolean sessionStarted = false;
        boolean teacherAdded = false;
        boolean studentsAdded = false;

        System.out.println("=== Attendance System ===");

        while (true) {

            if (!sessionStarted) {
                System.out.print("Type 'start' to begin attendance session: ");
                String input = sc.nextLine().trim().toLowerCase();

                if (input.equals("start")) {
                    sessionStarted = true;

                    System.out.print("Enter attendance date (yyyy-mm-dd) for this session: ");
                    attendanceDate = sc.nextLine();

                    System.out.println("Attendance session started on " + attendanceDate + ".\n");
                } else {
                    System.out.println("Please type 'start' to begin.");
                }
                continue;
            }

            if (sessionStarted && !teacherAdded) {
                System.out.print("addteacher id name subject: ");
                String[] input = sc.nextLine().split(" ");
                if (input[0].equalsIgnoreCase("addteacher") && input.length == 4) {
                    loggedInTeacherId = Integer.parseInt(input[1]);
                    String teacherName = input[2];
                    loggedInSubject = input[3];
                    service.addTeacher(loggedInTeacherId, teacherName, loggedInSubject);
                    teacherAdded = true;
                    System.out.println("Teacher added successfully.\n");
                } else {
                    System.out.println("Invalid command. Example: addteacher 101 Alice Math");
                }
                continue;
            }

            if (teacherAdded && !studentsAdded) {
                System.out.print(" addstudent id name: ");
                String line = sc.nextLine().trim();
                if (line.equalsIgnoreCase("done")) {
                    if (service.getNumberOfStudents() == 0) {
                        System.out.println("Add at least one student before proceeding.");
                        continue;
                    }
                    studentsAdded = true;
                    System.out.println("Students added successfully. You can now use commands: mark, get, show, exit.\n");
                    continue;
                }

                String[] input = line.split(" ");
                if (input[0].equalsIgnoreCase("addstudent") && input.length == 3) {
                    int studentId = Integer.parseInt(input[1]);
                    String studentName = input[2];
                    service.addStudent(studentId, studentName);
                } else {
                    System.out.println("Invalid command. Example: addstudent 1 John");
                }
                continue;
            }

            System.out.print("Enter command (mark studId status/getById/show/exit): ");
            String[] input = sc.nextLine().split(" ");
            String command = input[0].toLowerCase();

            switch (command) {

                case "mark":
                    if (input.length != 3) { 
                        System.out.println("Invalid command. Example: mark studentId status");
                        break;
                    }
                    int studentId = Integer.parseInt(input[1]);
                    String status = input[2];

                    if (!service.studentExists(studentId)) {
                        System.out.println("Student not found.");
                        break;
                    }

                    service.markAttendanceByTeacher(loggedInTeacherId, studentId, loggedInSubject, attendanceDate, status);
                    break;

                case "get":
                    if (input.length != 2) {
                        System.out.println("Invalid command. Example: get studentId");
                        break;
                    }
                    int getId = Integer.parseInt(input[1]);
                    service.getStudentById(getId);
                    break;

                case "show":
                    service.showReport();
                    break;

                case "exit":
                    System.out.println("Exiting system...");
                    return;

                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}

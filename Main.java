import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        AttendanceService service = new AttendanceService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Commands:");
        System.out.println("add [id] [name]");
        System.out.println("mark [id] [subject] [date:YYYY-MM-DD] [Present/Absent]");
        System.out.println("get [id]");
        System.out.println("show");
        System.out.println("exit");

        while (true) {
            System.out.print("\nEnter command: ");
            String[] input = sc.nextLine().split(" ");
            String command = input[0];

            switch (command.toLowerCase()) {
                case "add":
                    int id = Integer.parseInt(input[1]);
                    String name = input[2];
                    service.addStudent(id, name);
                    break;

                case "mark":
                    id = Integer.parseInt(input[1]);
                    String subject = input[2];
                    String date = input[3];
                    String status = input[4];
                    service.markAttendance(id, subject, date, status);
                    break;

                case "get":
                    id = Integer.parseInt(input[1]);
                    service.getStudentByID(id);
                    break;

                case "show":
                    service.showReport();
                    break;

                case "exit":
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}
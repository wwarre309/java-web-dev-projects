import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapStudents {
    public static void main (String[] args) {
        Map<Integer, String> classroom = new HashMap<>();
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter Student ID (or -1 to quit): ");
            int id= input.nextInt();
            if (id == -1) {
                break;
            }
            System.out.print("Enter Student Name: ");
            input.nextLine();
            String name = input.nextLine();

            classroom.put(id, name);
        } while (true);

        System.out.println("\nClassroom Roster:");
        for (Map.Entry<Integer, String> entry : classroom.entrySet()) {
            int id = entry.getKey();
            String name = entry.getValue();
            System.out.println("ID: " + id + ", Name: " + name);
        }

        input.close();
    }
}

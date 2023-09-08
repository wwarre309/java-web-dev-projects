//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Henry", "Mill", 103));
        employees.add(new Employee("Nal", "Brown", 9));
        employees.add(new Employee("Frank", "Hop", 865));
        employees.add(new Employee("Deborah", "King", 980));
        employees.add(new Employee("George", "Sky", 111));

        // Sort employees by last name
        employees.sort(Comparator.comparing(Employee::getLastName));

        // Print the sorted list
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

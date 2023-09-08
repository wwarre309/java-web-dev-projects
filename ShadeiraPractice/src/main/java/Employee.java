public class Employee implements Comparable<Employee> {
     String firstName;
     String lastName;
     int idNumber;

    public Employee(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getLastName().compareTo(o.getLastName());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + idNumber;
    }
}

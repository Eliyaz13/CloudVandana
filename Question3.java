import java.util.ArrayList;
import java.util.List;

// Employee class with attributes and method
class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(101, "Alice", 50000);
        Employee emp2 = new Employee(102, "Bob", 60000);
        Employee emp3 = new Employee(103, "Charlie", 55000);

        // Storing them in a list
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Displaying details of each employee
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}

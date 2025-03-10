package assignments;
import java.util.*;

class Employees {
    String[] employeeNames = {"Bharath", "ABC", "XYZ"};
    int[] employeeIDs = {1234, 1235, 1236};
}

class EmpGroups {
    String[] employeeNames;
    int[] employeeIDs;

    public EmpGroups(Employees employees) {
        // Initialize the arrays with data from Employees class
        this.employeeNames = employees.employeeNames;
        this.employeeIDs = employees.employeeIDs;
    }

    public void printEmployeeDetails() {
        for (int i = 0; i < employeeNames.length; i++) {
            System.out.println("Employee Name: " + employeeNames[i] + ", Employee ID: " + employeeIDs[i]);
        }
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        // Create an instance of the Employees class
        Employees employees = new Employees();

        // Create an instance of the EmpGroups class and pass the Employees instance
        EmpGroups empGroups = new EmpGroups(employees);

        // Print the employee details
        empGroups.printEmployeeDetails();
    }
}

package assignments;
import java.util.*;

class Employee {
    String id;
    String name;
    int age;
    String gender;
    String department;
    String position;
    double salary;
    String email;
    String contactNumber;

    public Employee(String id, String name, int age, String gender, String department, String position, double salary, String email, String contactNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        // Create a HashMap to store employee lists by department
        Map<String, ArrayList<Employee>> departmentEmployees = new HashMap<>();

        // Adding employees to the Engineering department
        ArrayList<Employee> engineeringEmployees = new ArrayList<>();
        engineeringEmployees.add(new Employee("E001", "Alice Green", 30, "Female", "Engineering", "Software Engineer", 75000, "alice@example.com", "9876543213"));
        departmentEmployees.put("Engineering", engineeringEmployees);

        // Adding employees to the Marketing department
        ArrayList<Employee> marketingEmployees = new ArrayList<>();
        marketingEmployees.add(new Employee("E002", "Bob Johnson", 35, "Male", "Marketing", "Marketing Manager", 85000, "bob@example.com", "9876543214"));
        departmentEmployees.put("Marketing", marketingEmployees);

        // Adding employees to the Sales department
        ArrayList<Employee> salesEmployees = new ArrayList<>();
        salesEmployees.add(new Employee("E003", "Carol White", 28, "Female", "Sales", "Sales Executive", 65000, "carol@example.com", "9876543215"));
        departmentEmployees.put("Sales", salesEmployees);

        // Print the email of Bob Johnson
        for (Employee employee : departmentEmployees.get("Marketing")) {
            if (employee.name.equals("Bob Johnson")) {
                System.out.println("Email of Bob Johnson: " + employee.getEmail());
            }
        }
    }
}

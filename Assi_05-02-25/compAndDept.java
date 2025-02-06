import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public List<Department> getDepartments() {  // Getter method
        return departments;
    }

    public void displayDepartments() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.displayEmployees();
        }
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    public void displayEmployees() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            System.out.println("Employee: " + emp.getName());
        }
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class compAndDept {
    public static void main(String[] args) {
        Company company = new Company("Tech Corp");
        company.addDepartment("IT");
        company.addDepartment("HR");

        company.getDepartments().get(0).addEmployee("Alice");  // Using getter
        company.getDepartments().get(0).addEmployee("Bob");
        company.getDepartments().get(1).addEmployee("Charlie");

        company.displayDepartments();
    }
}

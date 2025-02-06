import java.util.ArrayList;
import java.util.List;
public class facAndDept {
    public static void main(String[] args) {
        University university = new University("Tech University");
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");
        
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");
        
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        
        // **Fix: Use the getter method to access departments**
        university.getDepartments().get(0).addFaculty(faculty1);
        university.getDepartments().get(1).addFaculty(faculty2);
        
        university.displayDetails();
    }
}
class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> facultyMembers;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // **Fix: Provide a getter for departments**
    public List<Department> getDepartments() {
        return departments;
    }

    public void displayDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department dept : departments) {
            dept.displayDepartment();
        }
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            System.out.println(faculty.getName());
        }
    }
}

class Department {
    private String name;
    private List<Faculty> facultyMembers;

    public Department(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void displayDepartment() {
        System.out.println("Department: " + name);
        for (Faculty faculty : facultyMembers) {
            System.out.println("Faculty: " + faculty.getName());
        }
    }
}

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

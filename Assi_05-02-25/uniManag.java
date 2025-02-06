import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Course> courses;
    private List<Professor> professors;

    // Constructor
    public University(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String name;
    private List<Student> students;
    private Professor professor;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getName() {
        return name;
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class UniManag {
    public static void main(String[] args) {
        University university = new University("Tech University");

        Course course1 = new Course("Computer Science");
        Course course2 = new Course("Mathematics");

        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        university.addCourse(course1);
        university.addCourse(course2);
        university.addProfessor(professor1);
        university.addProfessor(professor2);

        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        course1.addStudent(student1);
        course1.addStudent(student2);
        course2.addStudent(student1);

        System.out.println("University: " + university.getName());
        System.out.println("Course: " + course1.getName() + " - Professor: " + professor1.getName());
        System.out.println("Course: " + course2.getName() + " - Professor: " + professor2.getName());
    }
}



class SchoolSystem {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 40);
        System.out.println(person.displayRole());

        Teacher teacher = new Teacher("Alice Smith", 35, "Mathematics");
        System.out.println(teacher.displayRole());

        Student student = new Student("Bob Johnson", 16, "10th Grade");
        System.out.println(student.displayRole());

        Staff staff = new Staff("Charlie Brown", 45, "Administration");
        System.out.println(staff.displayRole());
    }
}

class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    String displayRole() {
        return "General Person";
    }
}

class Teacher extends Person {
    String subject;
    
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    
    @Override
    String displayRole() {
        return "Teacher of subject: " + subject;
    }
}

class Student extends Person {
    String grade;
    
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    
    @Override
    String displayRole() {
        return "Student in grade: " + grade;
    }
}

class Staff extends Person {
    String department;
    
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    
    @Override
    String displayRole() {
        return "Staff member in department: " + department;
    }
}


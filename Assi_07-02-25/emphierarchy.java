public class emphierarchy {
    public static void main(String[] args) {
        Manager mng = new Manager ("Archit", 123, 300000);
        mng.displayDetails(10);
        Developer developer = new Developer("Akshat",456,350000);
        developer.displayDetails("JAVA");
        Intern intern = new Intern("Harshit",789,320000);
        intern.displayDetails();

    }
}
class Employee{
    String name;
    int Id;
    double salary;
   
    public void displayDetails(){
        System.out.println("this display details of employee");
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String name,int Id,double salary){
        this.name = name;
        this.Id = Id;
        this.salary = salary;
    }
    public void displayDetails(int teamSize){
        System.out.println("Team Size:"+ teamSize +" Name:"+ name +" Id:"+ Id +" Salary:"+ salary);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    Developer(String name,int Id,double salary){
        this.name = name;
        this.Id = Id;
        this.salary = salary;
    }
    public void displayDetails(String programmingLanguage){
        System.out.println("Programming Language:"+ programmingLanguage +" Name:"+ name +" Id:"+ Id +" Salary:"+ salary);
    }
}
class Intern extends Employee{
    Intern(String name,int Id,double salary){
        this.name = name;
        this.Id = Id;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println(" Name:"+ name +" Id:"+ Id +" Salary:"+ salary);
    }
}


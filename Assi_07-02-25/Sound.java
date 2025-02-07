
public class Sound {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy",12);
        dog.makeSound();
        Cat cat = new Cat("Sophia",6);
        cat.makeSound();

    }
}
class Animal{
    String name;
    int age;
   
    public void makeSound(){
        System.out.println("Animals make unique sounds");
    }
}
class Dog extends Animal{
        Dog(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
        }
        public void makeSound(){
        System.out.println("Bow Bow");
        }
}
class Cat extends Animal{
    Cat(String name, int age){
    this.name = name;
    this.age = age;
    System.out.println(name);
    System.out.println(age);
    }
    public void makeSound(){
    System.out.println("Meow Meow");
    }
}


package week09.Latihan;

class Animal{
    HealthRecord healthRecord = new HealthRecord();
    void makeSound(){
        System.out.println("Animal makes sound");
    }
    
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat meows");
    }
}

class HealthRecord{
    String recordNo;
    String recordDate;
}

class Owner{
    String name = "A";
    Animal pet = (Animal) new Dog();
}

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner();
        System.out.println(owner.pet instanceof Dog);
        System.out.println(owner.pet instanceof Cat);
    }
}

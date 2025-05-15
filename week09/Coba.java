package week09;

class Animal{
    void eat(){
        System.out.println("Aku makan");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Guk guk");
    }
}

class Pig extends Animal{
    void sound(){
        System.out.println("Oink oink");
    }
}

public class Coba {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sound();

        Pig pig = new Pig();
        pig.eat();
        pig.sound();
    }
}

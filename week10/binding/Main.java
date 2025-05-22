package week10.binding;

class Animal{
    static void suara(){
        System.out.println("Suara hewan");
    }

    void makan(){
        System.out.println("Hewan makan");
    }
}

class Dog extends Animal{
    @Override
    void makan(){
        System.out.println("Anjing makan daging");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.suara();
        Animal.suara();
        a.makan();

        Animal b = new Dog();
        b.makan();
    }
}

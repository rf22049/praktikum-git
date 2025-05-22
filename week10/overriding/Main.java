package week10.overriding;

class Animal{
    public void suara(){
        System.out.println("Suara hewan");
    }

    public void makan(){
        System.out.println("Hewan makan");
    }
}

class Dog extends Animal{
    @Override
    public void suara(){
        System.out.println("Suara anjing");
    }

    public void makan(String makanan, String minuman){
        System.out.println("Hewan makan " + makanan + " dan minum " + minuman);
    }
}

public class Main{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.suara();
        Animal d = new Dog();
        d.suara();
        d.makan();
    }
}
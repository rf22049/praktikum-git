package week11.Abstract;

public class Main {
    public static void main(String[] args) {
        Kucing k = new Kucing("KUCING");
        Anjing a = new Anjing("ANJING");

        k.makan();
        k.bersuara();

        a.makan();
        a.bersuara();
    }
}

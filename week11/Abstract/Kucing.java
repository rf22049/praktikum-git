package week11.Abstract;

public class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println(nama + " bersuara meong");
    }

    Kucing(String nama) {
        super(nama);
    }
}

package week08.PostTest;

class Orang{
    Orang(){
        System.out.println("Orang dibuat!");
    }
}

class Dosen extends Orang{
    Dosen(){
        System.out.println("Dosen dibuat!");
    }
}

public class PostTest2 {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
    }
}
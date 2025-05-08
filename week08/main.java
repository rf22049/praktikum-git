package week08;

class Kendaraan{
    String merek = "Toyota";

    Kendaraan(){
        System.out.println("Ini constructor parent");
    }

    void jalan(){
        System.out.println("Kendaraan sedang berjalan");
    }
}

class Mobil extends Kendaraan{
    String merek = "Mazda";
    Mobil(){
        super();
        System.out.println("Ini constructor child");
    }

    void printInfo(){
        System.out.println("merek mobil child: " + merek);
        System.out.println("merek mobil parent: " + super.merek);
    }

    void klakson(String merek){
        System.out.println("Mobil " + super.merek + " klakson");
    }
}

public class main {
    public static void main(String[] args) {
        Mobil jazz = new Mobil();
        //jazz.jalan();
        jazz.klakson("Honda");
        jazz.printInfo();
        System.out.println(jazz.merek);

        /*jazz.merek = "Honda";
        System.out.println(jazz.merek);
        jazz.klakson();*/
    }
}

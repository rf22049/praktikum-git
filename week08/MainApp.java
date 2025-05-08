package week08;

class Hewan{
   String suara = "Suara Hewan";
}

class Kucing extends Hewan{
   String suara = "Meong";
   
   void tampilkanSuara(){
      System.out.println("Suara milik kelas Kucing " + suara);
      System.out.println("Suara milik kelas Hewan " + super.suara);
   }
}

public class MainApp {
   public static void main(String[] args) {
      Kucing kucing = new Kucing();
      kucing.tampilkanSuara();
   }
}

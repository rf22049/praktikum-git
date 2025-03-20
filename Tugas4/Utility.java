public class Utility {
    static double diskon(int jumlahHari, double harga){
        if (jumlahHari > 5){
            return harga * jumlahHari * 0.9;
        }
        else{
            return harga * jumlahHari;
        }
    }
}
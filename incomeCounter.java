import java.util.Scanner;

public class incomeCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hitungan = "";
        int statusAbsen;
        int hariAbsen = 0;
        int izin = 0;
        int menu = 1;
        boolean hitunganInvalid = true;
        
        while (menu == 1) {
            System.out.println("Program penyusunan gaji mingguan");
            System.out.println("-----------------------");
            System.out.print("Masukkan ID karyawan: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan nama karyawan: ");
            String nama = input.nextLine();
            System.out.println("Selamat datang " + nama + " (" + id + ")");

            System.out.println("Pilih shift kerja:");
            System.out.println("1. pagi");
            System.out.println("2. Siang");
            System.out.println("3. Malam");
            System.out.print("Pilihan: ");
            int shift = input.nextInt();
            if (shift == 1) {
                System.out.println("Anda bekerja di pagi hari");
            } else if (shift == 2) {
                System.out.println("Anda bekerja di siang hari");
            } else if (shift == 3) {
                System.out.println("Anda bekerja di malam hari");
            } else {
                System.out.println("input tidak valid");
            }
            input.nextLine();
            System.out.println("Terima kasih untuk inputnya!");
            System.out.print("Masukkan total jam kerja dalam seminggu: ");
            int waktuMinggu = input.nextInt();
            input.nextLine();
            System.out.print("Apakah anda memiliki absen kerja? (y/n): ");
            char responAbsen = input.nextLine().charAt(0);

            switch (responAbsen) {
                case 'y':
                    statusAbsen = 1;
                    break;
                case 'n':
                    statusAbsen = 0;
                    break;
                default:
                    statusAbsen = -1;
                    break;
            }

            if (statusAbsen == 1) {
                System.out.print("Masukkan jumlah hari: ");
                hariAbsen = input.nextInt();
                System.out.print("Masukkan jumlah hari anda izin: ");
                izin = input.nextInt();
                input.nextLine();
            }

            if (waktuMinggu < 0) {
                hitunganInvalid = false;
            } else if (waktuMinggu > 40) {
                hitungan = "mendapat tambahan";
            } else if (waktuMinggu < 30) {
                hitungan = "terkena potongan 10%";
            } else {
                hitungan = "normal";
            }

            if (!hitunganInvalid || hariAbsen > 7 || statusAbsen == -1 || hariAbsen < 0 || shift < 1 || shift > 3) {
                System.out.println("Input tidak valid!");
            } else {
                System.out.println("Status upah: Anda " + hitungan);
                if (statusAbsen == 1) {
                    System.out.println("Status absen: " + hariAbsen + " hari");
                    System.out.println("Status potongan absen: Rp" + (Math.max(0, (hariAbsen - izin)) * 100000));
                }
            }
            
            System.out.println("Tekan 1 untuk mengulang");
            menu = input.nextInt();
            input.nextLine();
        }
        input.close();
    }
}
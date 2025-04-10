package postTest06.universitas;

public class Mahasiswa {
    private String nama;
    private int NIM;
    private String prodi;
    private double IPK;

    public Mahasiswa(String nama, int NIM, String prodi, double IPK){
        this.nama = nama;
        this.NIM = NIM;
        this.prodi = prodi;
        this.IPK = IPK;
    }

    public String getNama(){
        return nama;
    }

    public int getNim(){
        return NIM;
    }

    public String getProdi(){
        return prodi;
    }

    public double getIpk(){
        return IPK;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(int NIM){
        this.NIM = NIM;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setIpk(double IPK){
        this.IPK = IPK;
    }

    void tampilkanData(){
        System.out.println("---Data Mahasiswa---");
        System.out.println("NIM     : " + this.getNim());
        System.out.println("Nama    : " + this.getNama());
        System.out.println("Prodi   : " + this.getProdi());
        System.out.println("IPK     : " + this.getIpk());
    }
}

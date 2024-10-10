package Tugas;

public class Pegawai {
    String nip, nama, alamat;
    
    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getNama() {
        return nama;
    }
    public int getGaji() {
        return 0;
    }
}
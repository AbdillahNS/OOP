package Tugas;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    Anggota(String nomorKTP, String nama, int limitPeminjaman){
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setLimitPeminjaman(int limitPeminjaman){
        this.limitPeminjaman = limitPeminjaman;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPeminjaman(){
        return limitPeminjaman;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    public void pinjam(int uang){
        if (limitPeminjaman < jumlahPinjaman + uang) {
            System.out.println("Maaf jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += uang;
        }
    }
    public void angsur(int uang){
        if (uang < jumlahPinjaman / 10) {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        } else {
            jumlahPinjaman -= uang;
        }
    }
}
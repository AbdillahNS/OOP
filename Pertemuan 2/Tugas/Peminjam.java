package Tugas;

public class Peminjam {
    int id, lamaSewa;
    String namaMember, namaGame;
    double harga;

    public double hitungHarga() {
        return lamaSewa * harga;
    }

    public void tampilDataPeminjaman() {
        System.out.println("ID          : " + id);
        System.out.println("Lama Sewa   : " + lamaSewa + " Hari");
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga       : " + hitungHarga());
    }
}
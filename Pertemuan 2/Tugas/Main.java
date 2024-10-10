package Tugas;

public class Main {
    public static void main(String[] args) {
        Peminjam pinjam1 = new Peminjam();

        pinjam1.id = 101;
        pinjam1.lamaSewa = 2;
        pinjam1.namaMember = "Roihan";
        pinjam1.namaGame = "GTA V";
        pinjam1.harga = 100000;
        pinjam1.tampilDataPeminjaman();
    }
}
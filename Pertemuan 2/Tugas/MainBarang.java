package Tugas;

public class MainBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        
        brg1.kode = "001";
        brg1.namaBarang = "Buku";
        brg1.hargaDasar = 10000;
        brg1.diskon = 10;
        brg1.tampilData();
    }
}
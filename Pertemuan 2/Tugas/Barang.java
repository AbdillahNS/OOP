package Tugas;

public class Barang {
    String kode, namaBarang;
    int hargaDasar;
    float diskon;

    public int hitungHargaJual() {
        int hargaJual = hargaDasar - (int) (diskon * hargaDasar / 100);
        return hargaJual;
    }
    
    public void tampilData() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon      : " + diskon + "%");
        System.out.println("Harga Jual  : " + hitungHargaJual());
    }
}
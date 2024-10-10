package Tugas;

public class Buku {
    String judul;
    int halaman;

    public void setJudul(String newValue) {
        judul = newValue;
    }

    public void setHalaman(int newValue) {
        halaman = newValue;
    }

    public void cetakStatus() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Halaman Buku: " + halaman);
    }
}
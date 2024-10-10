package Tugas;

public class Mobil {
    String warna;
    int kecepatan;

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;
    }

    public void cetakStatus() {
        System.out.println("Warna Mobil: " + warna);
        System.out.println("Kecepatan: " + kecepatan);
    }
}
package Tugas;

public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran();
        l.phi = 3.14;
        l.r = 7;
        System.out.println("Luas Lingkaran = " + l.hitungLuas());
        System.out.println("Keliling Lingkaran = " + l.hitungKeliling());
    }
}
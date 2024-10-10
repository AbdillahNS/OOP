package Tugas;

public class Televisi extends Elektronik {
    int kecerahan;

    public void setkecerahan(int newValue) {
        kecerahan = newValue;
    }

    public void cetakStatus() {
        System.out.println("Kecerahan: " + kecerahan);
    }
}
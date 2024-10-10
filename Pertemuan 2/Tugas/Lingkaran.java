package Tugas;

public class Lingkaran {
    double phi;
    double r;

    public double hitungLuas() {
        return phi * r * r;
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }
}
package Tugas;

public class Segitigaa {
    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC) {
        int keliling;
        keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public double keliling(int sisiA, int sisiB) {
        double c;
        c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return Math.round(sisiA + sisiB + c);
    }
}
package Tugas;

public class MainSegitiga {
    public static void main(String[] args) {
        Segitigaa segitiga = new Segitigaa();

        int totalSudut1 = segitiga.totalSudut(90);
        System.out.println("Total sudut dengan satu sudut: " + totalSudut1);

        int totalSudut2 = segitiga.totalSudut(60, 90);
        System.out.println("Total sudut dengan dua sudut: " + totalSudut2);

        int keliling1 = segitiga.keliling(2, 4, 6);
        System.out.println("Keliling segitiga dengan tiga sisi: " + keliling1);

        double keliling2 = segitiga.keliling(4, 6);
        System.out.println("Keliling segitiga siku-siku dengan dua sisi: " + keliling2);
    }
}
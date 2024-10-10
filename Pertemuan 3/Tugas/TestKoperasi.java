package Tugas;
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        while (true) {
        System.out.println("Menu : ");
        System.out.println("1. Pinjam : ");
        System.out.println("2. Angsur : ");
        System.out.print("Masukkan pilihan : ");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.print("Masukkan uang yang ingin dipinjam : ");
                int uang = sc.nextInt();
                donny.pinjam(uang);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                break;
            case 2:
                System.out.print("Masukkan uang yang ingin diangsur : ");
                uang = sc.nextInt();
                donny.angsur(uang);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
            }
        }
    }
}

        //System.out.println("Nama Anggota: " + donny.getNama());
        //System.out.println("Limit Peminjaman: " + donny.getLimitPeminjaman());

        //System.out.println("\nMeminjam uang 10.000.000");
        //donny.pinjam(10000000);
        //System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        //System.out.println("\nMeminjam uang 4.000.000");
        //donny.pinjam(4000000);
        //System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        //System.out.println("\nMeminjam uang 1.000.000");
        //donny.angsur(1000000);
        //System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        //System.out.println("\nMeminjam uang 3.000.000");
        //donny.angsur(30000);
        //System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
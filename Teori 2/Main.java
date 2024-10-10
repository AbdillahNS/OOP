import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        String namaDosen, namaMahasiswa, namaMatkul;
        int nilaiMahasiswa;

        System.out.print("Masukkan nama dosen penilai : ");
        namaDosen = sc.nextLine();
        Dosen dosen = new Dosen(namaDosen);

        System.out.print("Masukkan nama mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(namaMahasiswa);

        System.out.print("Masukkan nama mata kuliah : ");
        namaMatkul = sc.nextLine();
        Matkul matkul = new Matkul(namaMatkul);

        System.out.print("Masukkan nilai Mahasiswa : ");
        nilaiMahasiswa = sc1.nextInt();
        mahasiswa.nilai = nilaiMahasiswa;

        System.out.println("\n===== Penilaian Mahasiswa =====");
        System.out.println("Dosen penilai : " + dosen.nama);
        System.out.println("Mahasiswa : " + mahasiswa.nama);
        System.out.println("Mata kuliah : " + matkul.namaMatkul);
        System.out.println("Nilai : " + mahasiswa.nilai);
    }
}

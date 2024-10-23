package Tugas;
public class MainManusia {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Manusia:");
        manusia.bernafas();
        manusia.makan();

        System.out.println("\nDosen:");
        dosen.bernafas();
        dosen.makan();
        dosen.lembur();

        System.out.println("\nMahasiswa:");
        mahasiswa.bernafas();
        mahasiswa.makan();
        mahasiswa.tidur();
    }
}
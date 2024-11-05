public class Mahasiswa implements ICumlaude {
    protected String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    public void kuliahDiKampus() {
        System.out.println("Aku mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
    @Override
    public void lulus() {
        System.out.println("Aku lulus sebagai mahasiswa biasa.");
    }
    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
}
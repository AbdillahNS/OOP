public class Kuis extends Konten {
    private String jenisKuis;
    private int jmlPertanyaan;

    public Kuis(String idKonten, String judul, String deskripsi, String jenisKuis, int jmlPertanyaan) {
        super(idKonten, judul, "Kuis", deskripsi);
        this.jenisKuis = jenisKuis;
        this.jmlPertanyaan = jmlPertanyaan;
    }

    public String getJenisKuis() {
        return jenisKuis;
    }

    public void setJenisKuis(String jenisKuis) {
        this.jenisKuis = jenisKuis;
    }

    public int getJmlPertanyaan() {
        return jmlPertanyaan;
    }

    public void setJmlPertanyaan(int jmlPertanyaan) {
        this.jmlPertanyaan = jmlPertanyaan;
    }

    public void tampilKuis() {
        System.out.println("ID Kuis: " + getIdKonten());
        System.out.println("Judul Kuis: " + getJudul());
        System.out.println("Jenis Kuis: " + getJenisKuis());
        System.out.println("Jumlah Soal Kuis: " + getJmlPertanyaan());
        System.out.println("Deskripsi Kuis: " + getDeskripsi());
    }
}
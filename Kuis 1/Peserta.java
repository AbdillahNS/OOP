public class Peserta {
    private static int idCounter = 0;
    private static int pesertaTerdaftar = 0;
    private static final int batasPeserta = 2;
    private String idPeserta;
    private String nama;
    private String email;

    public Peserta(String nama, String email) {
        idCounter++;
        this.idPeserta = "P00" + idCounter;
        this.nama = nama;
        this.email = email;
    }

    public String getIdPeserta() {
        return idPeserta;
    }

    public void setIdPeserta(String idPeserta) {
        this.idPeserta = idPeserta;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void daftarKursus(Kursus kursus) {
        if (pesertaTerdaftar < batasPeserta) {
            pesertaTerdaftar++;
            System.out.println("Peserta " + nama + " berhasil mendaftar ke kursus " + kursus.getNamaKursus());
        } else {
            System.out.println("Peserta " + nama + " gagal mendaftar ke kursus " + kursus.getNamaKursus() + " (Mencapai Limit!)");
        }
    }

    public void tampilPeserta() {
        System.out.println("ID Peserta: " + getIdPeserta());
        System.out.println("Nama Peserta: " + getNama());
        System.out.println("Email Peserta: " + getEmail());
    }
}
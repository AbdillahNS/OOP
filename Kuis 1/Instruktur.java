public class Instruktur {
    private static int idCounter = 0;
    private String idInstruktur;
    private String nama;
    private String spesialis;

    public Instruktur(String nama, String spesialis) {
        idCounter++;
        this.idInstruktur = "I00" + idCounter;
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public String getIdInstruktur() {
        return idInstruktur;
    }

    public void setIdInstruktur(String idInstruktur) {
        this.idInstruktur = idInstruktur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getspesialis() {
        return spesialis;
    }

    public void setspesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public void tampilInstruktur() {
        System.out.println("ID Instruktur: " + getIdInstruktur());
        System.out.println("Nama Instruktur: " + getNama());
        System.out.println("Spesialisasi Instruktur: " + getspesialis());
    }

    public void buatKonten(Konten konten) {
        System.out.println("Instruktur " + nama + " membuat konten dengan judul: " + konten.getJudul());
    }
}
public class Konten {
    private String idKonten;
    private String judul;
    private String tipeKonten;
    private String deskripsi;

    public Konten(String idKonten, String judul, String tipeKonten, String deskripsi) {
        this.idKonten = idKonten;
        this.judul = judul;
        this.tipeKonten = tipeKonten;
        this.deskripsi = deskripsi;
    }

    public String getIdKonten() {
        return idKonten;
    }

    public void setIdKonten(String idKonten) {
        this.idKonten = idKonten;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTipeKonten() {
        return tipeKonten;
    }

    public void setTipeKonten(String tipeKonten) {
        this.tipeKonten = tipeKonten;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
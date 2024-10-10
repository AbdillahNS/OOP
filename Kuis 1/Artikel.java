public class Artikel extends Konten {
    private String tipeArtikel;
    private String penulis;

    public Artikel(String idKonten, String judul, String deskripsi, String tipeArtikel, String penulis) {
        super(idKonten, judul, "Artikel", deskripsi);
        this.tipeArtikel = tipeArtikel;
        this.penulis = penulis;
    }

    public String getTipeArtikel() {
        return tipeArtikel;
    }

    public void setTipeArtikel(String tipeArtikel) {    
        this.tipeArtikel = tipeArtikel;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void tampilArtikel() {
        System.out.println("ID Artikel: " + getIdKonten());
        System.out.println("Judul Artikel: " + getJudul());
        System.out.println("tipe Artikel: " + getTipeArtikel());
        System.out.println("Penulis Artikel: " + getPenulis());
        System.out.println("Deskripsi Artikel: " + getDeskripsi());
    }
}
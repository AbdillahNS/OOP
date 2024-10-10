public class Kursus {
    private static int idCounter = 0;;
    private String idKursus;
    private String namaKursus;
    private double harga;

    public Kursus(String namaKursus, double harga) {
        idCounter++;
        this.idKursus = "K00" + idCounter;
        this.namaKursus = namaKursus;
        this.harga = harga;
    }

    public String getIdKursus() {
        return idKursus;
    }

    public void setIdKursus(String idKursus) {
        this.idKursus = idKursus;
    }

    public String getNamaKursus() {
        return namaKursus;
    }

    public void setNamaKursus(String namaKursus) {
        this.namaKursus = namaKursus;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilKursus(){
        System.out.println("ID Kursus: " + getIdKursus());
        System.out.println("Nama Kursus: " + getNamaKursus());
        System.out.println("Harga Kursus: " + getHarga());
    }
}
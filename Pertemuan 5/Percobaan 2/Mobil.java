public class Mobil {
    private String nama;
    private int biaya;

    public Mobil() {
        
    }

    public Mobil(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() { 
        return biaya;
    }
}
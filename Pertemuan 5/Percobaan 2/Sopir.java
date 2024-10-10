public class Sopir {
    private String nama;
    private int biaya;

    public Sopir() {
        
    }

    public Sopir(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }
}
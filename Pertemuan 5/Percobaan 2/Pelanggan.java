public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;

    public Pelanggan() {

    }
    
    public Pelanggan(String nama, Mobil mobil, Sopir sopir) {
        this.nama = nama;
        this.mobil = mobil;
        this.sopir = sopir;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public Sopir getSopir() {
        return sopir;
    }
}
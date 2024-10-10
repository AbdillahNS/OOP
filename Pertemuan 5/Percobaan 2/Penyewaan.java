public class Penyewaan {
    private int hari;
    private Mobil mobil;
    private Sopir sopir;
    private Pelanggan pelanggan;

    public Penyewaan() {

    }

    public Penyewaan(int hari, Mobil mobil, Sopir sopir, Pelanggan pelanggan) {
        this.hari = hari;
        this.mobil = mobil;
        this.sopir = sopir;
        this.pelanggan = pelanggan;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getHari() {
        return hari;
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

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public int hitungBiayaSopir(int hari) {
        return sopir.getBiaya() * hari;
    }

    public int hitungBiayaMobil(int hari) {
        return mobil.getBiaya() * hari;
    }

    public int hitungBiayaTotal(int hari) {
        return hitungBiayaMobil(hari) + hitungBiayaSopir(hari);
    }
}
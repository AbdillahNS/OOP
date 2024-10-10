public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlahKursi) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlahKursi];
        initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) { 
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1)); 
        } 
    }

    public String info() { 
        String info = ""; 
        info += "Kode Gerbong: " + kode + "\n"; 
        for (Kursi kursi : arrayKursi) { 
            info += kursi.info(); 
        } 
        return info;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) { 
        if (this.arrayKursi[nomor - 1].getPenumpang() != null) {
            System.out.println("Kursi nomor " + nomor + " sudah ditempati!");
        } else {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        } 
    }
}
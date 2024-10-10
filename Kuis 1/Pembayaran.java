public class Pembayaran {
    private static int idCounter = 0;
    private String idPembayaran;
    private String metode;
    private double jumlah;

    public Pembayaran(String metode, double jumlah) {
        idCounter++;
        this.idPembayaran = "B00" + idCounter;
        this.metode = metode;
        this.jumlah = jumlah;
    }

    public String getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public void bayar() {
        System.out.println("Pembayaran sebesar " + jumlah + " berhasil menggunakan metode: " + metode);
    }

    public void tampilPembayaran() {
        System.out.println("ID Pembayaran: " + getIdPembayaran());
        System.out.println("Metode Pembayaran: " + getMetode());
        System.out.println("Jumlah Pembayaran: " + getJumlah());
    }
}
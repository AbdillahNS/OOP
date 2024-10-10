public class KeretaApi01 {
    private String nama; 
    private String kelas;
    private Gerbong[] arrayGerbong;

    public KeretaApi01(String nama, String kelas, int jumlahGerbong, int jumlahKursiPerGerbong) {
        this.nama = nama; 
        this.kelas = kelas;
        this.arrayGerbong = new Gerbong[jumlahGerbong];
        initGerbong(jumlahKursiPerGerbong);
    }

    private void initGerbong(int jumlahKursiPerGerbong) {
        for (int i = 0; i < arrayGerbong.length; i++) {
            arrayGerbong[i] = new Gerbong("G00" + (i + 1), jumlahKursiPerGerbong);
        }
    }

    public Gerbong getGerbong(int nomor) {
        return arrayGerbong[nomor - 1];
    }

    public String info() { 
        String info = ""; 
        info += "Nama Kereta: " + this.nama + "\n"; 
        info += "Kelas: " + this.kelas + "\n"; 
        for (Gerbong gerbong : arrayGerbong) {
            info += gerbong.info() + "\n";
        }
        return info; 
    }
}
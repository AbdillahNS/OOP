package Tugas;

public class Dosen extends Pegawai {
    int jumlahSKS;
    int TARIF_SKS = 100000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }
    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}
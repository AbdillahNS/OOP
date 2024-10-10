package Tugas;

public class DaftarGaji {
    Pegawai[] listPegawai;
    int jmlPegawai;

    public DaftarGaji(int maxPegawai) {
        listPegawai = new Pegawai[maxPegawai];
    }
    public void addPegawai(Pegawai pegawai) {
        if (jmlPegawai < listPegawai.length) {
            listPegawai[jmlPegawai] = pegawai;
            jmlPegawai++;
        }
    }
    public void printSemuaGaji() {
        for (int i = 0; i < jmlPegawai; i++) {
            Pegawai pegawai = listPegawai[i];
            System.out.println("Nama: " + pegawai.getNama() + 
            ", Gaji: " + pegawai.getGaji());
        }
    }
}
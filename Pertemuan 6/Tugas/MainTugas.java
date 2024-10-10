package Tugas;

public class MainTugas {
    public static void main(String[] args) {
        DaftarGaji dg = new DaftarGaji(2);

        Dosen dosen1 = new Dosen("1234", "Roihan", "Jl. Mawar");
        dosen1.setSKS(10);

        Dosen dosen2 = new Dosen("5678", "Rehan", "Jl. Melati");
        dosen2.setSKS(20);

        dg.addPegawai(dosen1);
        dg.addPegawai(dosen2);

        dg.printSemuaGaji();
    }
}
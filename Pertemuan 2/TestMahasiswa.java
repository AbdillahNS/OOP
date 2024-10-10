public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa01 mhs1 = new Mahasiswa01();
        Mahasiswa01 mhs2 = new Mahasiswa01();
        Mahasiswa01 mhs3 = new Mahasiswa01();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        mhs2.nim = 102;
        mhs2.nama = "Roihan";
        mhs2.alamat = "Jl. Roger No 12";
        mhs2.kelas = "2B";
        mhs2.tampilBiodata();

        mhs3.nim = 103;
        mhs3.nama = "Galih";
        mhs3.alamat = "Jl. Balmond No 7";
        mhs3.kelas = "2B";
        mhs3.tampilBiodata();
    }
}
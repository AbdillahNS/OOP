public class Barang {
    String namaBrg;
    String jenisBrg;
    int stok;

    public void tampilBarnag() {
        System.out.println("Nama Barang  : " + namaBrg);
        System.out.println("Jenis Barang : " + jenisBrg);
        System.out.println("Stok         : " + stok);
    }

    //method dengan argumen dan nilai balik (return)
    public int tambahStok(int brgMasuk){
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
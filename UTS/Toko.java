package UTS;

public class Toko {

    public void beliBibit(Pemain pemain, int jumlah, String jenisBibit) {
        int hargaBibit = 0;
        switch (jenisBibit) {
            case "Padi":
                hargaBibit = 1000;
                break;
            case "Jagung":
                hargaBibit = 1500; 
                break;
            case "Sawi":
                hargaBibit = 500; 
                break;
        }

        int totalHarga = hargaBibit * jumlah;
        if (pemain.getUang() >= totalHarga) {
            pemain.kurangiUang(totalHarga);
            pemain.tambahBibit(jenisBibit, jumlah);
            System.out.println("Berhasil membeli " + jumlah + " bibit " + jenisBibit + " dengan total harga " + totalHarga);
        } else {
            System.out.println("Uang tidak cukup untuk membeli bibit.");
        }
    }

    public void jualHasilPanen(Pemain pemain, int jumlah) {
        int hargaPanen = 50000;
        int totalPenjualan = jumlah * hargaPanen;

        pemain.kurangiHasilPanen(jumlah);
        pemain.tambahUang(totalPenjualan);
        System.out.println("Berhasil menjual " + jumlah + " hasil panen dengan harga total " + totalPenjualan);
    }
}

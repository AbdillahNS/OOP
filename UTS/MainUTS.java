package UTS;

import java.util.Scanner;

public class MainUTS {
    static Scanner sc = new Scanner(System.in);
    static Waktu waktu = new Waktu(1);
    static Cuaca cuaca = new Cuaca();
    static Pemain pemain = new Pemain(100000);
    static Toko toko = new Toko();

    public static void main(String[] args) {
        Lahan lahan = new Lahan(1, pemain);
        boolean menu = true;

        while (menu) {
            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║            Simulasi Pertanian         ║");
            System.out.println("╚═══════════════════════════════════════╝");
            System.out.println("1. Menanam Tanaman");
            System.out.println("2. Menyiram Tanaman");
            System.out.println("3. Memberi Pupuk");
            System.out.println("4. Panen Tanaman");
            System.out.println("5. Cek Status Tanaman");
            System.out.println("6. Update Hari");
            System.out.println("7. Cek kondisi Cuaca");
            System.out.println("8. Cek Inventori");
            System.out.println("9. Toko");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            int pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("╔══════════════════════════════════════════════════════╗");
                    System.out.println("║        Pilih jenis tanaman yang ingin ditanam        ║");
                    System.out.println("╚══════════════════════════════════════════════════════╝");
                    System.out.println("1. Padi");
                    System.out.println("2. Jagung");
                    System.out.println("3. Sawi");
                    System.out.print("Pilih Menu: ");
                    int jenisTanaman = sc.nextInt();

                    Tanaman tanaman = null;
                    switch (jenisTanaman) {
                        case 1:
                            tanaman = new Padi();
                            break;
                        case 2:
                            tanaman = new Jagung();
                            break;
                        case 3:
                            tanaman = new Sawi();
                            break;
                    }
                    if (tanaman != null) {
                        lahan.menanam(tanaman);
                    }
                    break;

                case 2:
                    System.out.println("╔════════════════════════════════╗");
                    System.out.println("║         Menyiram Tanaman       ║");
                    System.out.println("╚════════════════════════════════╝");
                    lahan.siramTanaman();
                    break;

                case 3:
                    System.out.println("╔════════════════════════════════╗");
                    System.out.println("║         Memberi Pupuk          ║");
                    System.out.println("╚════════════════════════════════╝");
                    lahan.beriPupuk(pemain);
                    break;
                case 4:
                    System.out.println("╔════════════════════════════════╗");
                    System.out.println("║          Panen Tanaman         ║");
                    System.out.println("╚════════════════════════════════╝");
                    lahan.panenTanaman(pemain);
                    break;

                case 5:
                    System.out.println("╔════════════════════════════════╗");
                    System.out.println("║        Cek Status Tanaman      ║");
                    System.out.println("╚════════════════════════════════╝");
                    lahan.cekStatusTanaman();
                    break;

                case 6:
                    System.out.println("╔════════════════════════════════╗");
                    System.out.println("║           Update Hari          ║");
                    System.out.println("╚════════════════════════════════╝");
                    System.out.print("Masukkan ingin update Hari ke berapa: ");
                    int tambahanHari = sc.nextInt();
                    waktu.updateHari(tambahanHari);

                    if (lahan.getPadi() != null) {
                        lahan.getPadi().setHariTumbuh(tambahanHari);
                        lahan.getPadi().setMenyiram(false);
                    }
                    if (lahan.getJagung() != null) {
                        lahan.getJagung().setHariTumbuh(tambahanHari);
                        lahan.getJagung().setMenyiram(false);
                    }
                    if (lahan.getSawi() != null) {
                        lahan.getSawi().setHariTumbuh(tambahanHari);
                        lahan.getSawi().setMenyiram(false);
                    }
                    break;

                case 7:
                    System.out.println("╔══════════════════════════════════════╗");
                    System.out.println("║          Cek Kondisi Cuaca           ║");
                    System.out.println("╚══════════════════════════════════════╝");

                    System.out.print("Masukkan suhu (°C): ");
                    int suhu = sc.nextInt();
                    System.out.print("Masukkan kelembaban (%): ");
                    int kelembaban = sc.nextInt();

                    cuaca.updateCuaca(suhu, kelembaban);

                    if (lahan.getPadi() != null) {
                        cuaca.pertumbuhanTanaman(lahan.getPadi());
                    }
                    if (lahan.getJagung() != null) {
                        cuaca.pertumbuhanTanaman(lahan.getJagung());
                    }
                    if (lahan.getSawi() != null) {
                        cuaca.pertumbuhanTanaman(lahan.getSawi());
                    }
                    break;

                case 8:
                    System.out.println("╔════════════════════════════════╗");
                    System.out.println("║           Cek Inventori        ║");
                    System.out.println("╚════════════════════════════════╝");
                    pemain.tampilkanInventori();
                    break;

                case 9:
                    System.out.println("╔═════════════════════════╗");
                    System.out.println("║           Toko          ║");
                    System.out.println("╚═════════════════════════╝");
                    System.out.println("1. Membeli Bibit Tanaman");
                    System.out.println("2. Membeli Pupuk Tanaman");
                    System.out.println("3. Menjual Hasil Panen");
                    System.out.print("Pilih Menu: ");
                    int pilihanToko = sc.nextInt();
                    switch (pilihanToko) {
                        case 1:
                            System.out.println("Jenis bibit yang tersedia:");
                            System.out.println("1. Bibit Padi (1000)");
                            System.out.println("2. Bibit Jagung (1500)");
                            System.out.println("3. Bibit Sawi (500)");
                            System.out.print("Pilih jenis bibit: ");
                            int jenisBibit = sc.nextInt();
                            System.out.print("Masukkan jumlah Bibit yang ingin dibeli: ");
                            int jumlahBibit = sc.nextInt();
                            switch (jenisBibit) {
                                case 1:
                                    toko.beliBibit(pemain, jumlahBibit, "Padi");
                                    break;
                                case 2:
                                    toko.beliBibit(pemain, jumlahBibit, "Jagung");
                                    break;
                                case 3:
                                    toko.beliBibit(pemain, jumlahBibit, "Sawi");
                                    break;
                                default:
                                    System.out.println("Jenis bibit tidak valid.");
                                    break;
                            }
                            break;

                        case 2:
                            System.out.print("Masukkan jumlah pupuk yang ingin dibeli (1 = 10000): ");
                            int jumlahPupuk = sc.nextInt();
                            toko.beliPupuk(pemain, jumlahPupuk);
                            break;
                        case 3:
                            pemain.tampilkanInventori();
                            System.out.print("Masukkan jumlah hasil panen yang ingin dijual: ");
                            int jumlahPanen = sc.nextInt();
                            toko.jualHasilPanen(pemain, jumlahPanen);
                            break;
                        default:
                            System.out.println("Menu tidak tersedia.");
                            break;
                    }
                    break;

                case 0:
                    System.out.println("Berhasil Keluar Program.");
                    menu = false;
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
                    break;
            }
        }
    }
}
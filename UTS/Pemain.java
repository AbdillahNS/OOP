package UTS;

public class Pemain {
    private int uang;
    private int jumlahHasilPanen;
    private String[] inventoriTanaman;
    private int kapasitasInventori;
    private int jumlahBibitPadi;
    private int jumlahBibitJagung;
    private int jumlahBibitSawi;
    private int jumlahPupuk;

    public Pemain(int uang) {
        this.uang = uang;
        this.jumlahHasilPanen = 0;
        this.kapasitasInventori = 30;
        this.inventoriTanaman = new String[kapasitasInventori];
        this.jumlahBibitPadi = 1;
        this.jumlahBibitJagung = 1;
        this.jumlahBibitSawi = 1;
        this.jumlahPupuk = 1;
    }

    public int getUang() {
        return uang;
    }


    public void kurangiUang(int jumlah) {
        uang -= jumlah;
    }

    public void tambahUang(int jumlah) {
        uang += jumlah;
    }

    public void tambahHasilPanen(String namaTanaman) {
        if (jumlahHasilPanen < kapasitasInventori) {
            inventoriTanaman[jumlahHasilPanen] = namaTanaman;
            jumlahHasilPanen++;
        } else {
            System.out.println("Inventori penuh, tidak bisa menambah hasil panen.");
        }
    }

    public int getHasilPanen() {
        return jumlahHasilPanen;
    }

    public String getSemuaHasilPanen(int index) {
        if (index >= 0 && index < jumlahHasilPanen) {
            return inventoriTanaman[index];
        }
        return null;
    }

    public void kurangiHasilPanen(int jumlah) {
        if (jumlahHasilPanen >= jumlah) {
            for (int i = 0; i < jumlah; i++) {
                inventoriTanaman[i] = null;
            }
            jumlahHasilPanen -= jumlah;
            System.out.println(jumlah + " hasil panen telah dijual.");
        } else {
            System.out.println("Tidak ada cukup hasil panen untuk dijual.");
        }
    }

    public void tambahBibit(String jenisBibit, int jumlah) {
        switch (jenisBibit) {
            case "Padi":
                jumlahBibitPadi += jumlah;
                break;
            case "Jagung":
                jumlahBibitJagung += jumlah;
                break;
            case "Sawi":
                jumlahBibitSawi += jumlah;
                break;
        }
    }

    public void kurangiBibit(String jenisBibit, int jumlah) {
        switch (jenisBibit) {
            case "Padi":
                if (jumlahBibitPadi >= jumlah) {
                    jumlahBibitPadi -= jumlah;
                } else {
                    System.out.println("Tidak cukup bibit Padi.");
                }
                break;
            case "Jagung":
                if (jumlahBibitJagung >= jumlah) {
                    jumlahBibitJagung -= jumlah;
                } else {
                    System.out.println("Tidak cukup bibit Jagung.");
                }
                break;
            case "Sawi":
                if (jumlahBibitSawi >= jumlah) {
                    jumlahBibitSawi -= jumlah;
                } else {
                    System.out.println("Tidak cukup bibit Sawi.");
                }
                break;
        }
    }

    public boolean cekBibit(String jenisBibit) {
        switch (jenisBibit) {
            case "Padi":
                return jumlahBibitPadi > 0;
            case "Jagung":
                return jumlahBibitJagung > 0;
            case "Sawi":
                return jumlahBibitSawi > 0;
        }
        return false;
    }

    public int getJumlahPupuk() {
        return jumlahPupuk;
    }

    public void tambahPupuk(int jumlah) {
        jumlahPupuk += jumlah;
    }

    public void kurangiPupuk(int jumlah) {
        if (jumlahPupuk >= jumlah) {
            jumlahPupuk -= jumlah;
        } else {
            System.out.println("Tidak cukup pupuk.");
        }
    }

    public void tampilkanInventori() {
        System.out.println("Inventori Hasil Panen:");
        for (int i = 0; i < jumlahHasilPanen; i++) {
            System.out.println("- " + inventoriTanaman[i]);
        }
        System.out.println("\nInventori Tanaman:");
        System.out.println("Bibit Padi: " + jumlahBibitPadi);
        System.out.println("Bibit Jagung: " + jumlahBibitJagung);
        System.out.println("Bibit Sawi: " + jumlahBibitSawi);
        System.out.println("Pupuk: " + jumlahPupuk);
        System.out.println("Uang saat ini: " + uang);
    }
}
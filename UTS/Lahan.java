package UTS;

public class Lahan {
    private int ukuran;
    private Padi padi;
    private Jagung jagung;
    private Sawi sawi;
    private Pemain pemain;

    public Lahan(int ukuran, Pemain pemain) {
        this.ukuran = ukuran;
        this.pemain = pemain;
    }

    public void infoLahan() {
        System.out.println("Tanaman ditanam di lahan, dengan Ukuran lahan " + ukuran + " hektar\n");
    }

    public Padi getPadi() {
        return padi;
    }

    public Jagung getJagung() {
        return jagung;
    }

    public Sawi getSawi() {
        return sawi;
    }

    public void menanam(Tanaman tanaman) {
        String jenis = tanaman.getJenisTanaman();
        switch (jenis) {
            case "Padi":
                if (padi == null) {
                    if (pemain.cekBibit("Padi")) {
                        padi = (Padi) tanaman;
                        pemain.kurangiBibit("Padi", 1);
                        System.out.println("Padi telah ditanam");
                    } else {
                        System.out.println("Tidak ada bibit Padi.");
                    }
                } else {
                    System.out.println("Padi sudah ada di lahan.");
                }
                break;
            case "Jagung":
                if (jagung == null) {
                    if (pemain.cekBibit("Jagung")) {
                        jagung = (Jagung) tanaman;
                        pemain.kurangiBibit("Jagung", 1);
                        System.out.println("Jagung telah ditanam");
                    } else {
                        System.out.println("Tidak ada bibit Jagung.");
                    }
                } else {
                    System.out.println("Jagung sudah ada di lahan.");
                }
                break;
            case "Sawi":
                if (sawi == null) {
                    if (pemain.cekBibit("Sawi")) {
                        sawi = (Sawi) tanaman;
                        pemain.kurangiBibit("Sawi", 1);
                        System.out.println("Sawi telah ditanam");
                    } else {
                        System.out.println("Tidak ada bibit sawi.");
                    }
                } else {
                    System.out.println("Sawi sudah ada di lahan.");
                }
                break;
            default:
                System.out.println("Tanaman tidak valid.");
                break;
        }
    }

    public void cekStatusTanaman() {
        infoLahan();
        if (padi != null) padi.statusTanaman();
        if (jagung != null) jagung.statusTanaman();
        if (sawi != null) sawi.statusTanaman();
    }

    public void panenTanaman(Pemain pemain) {
        if (padi != null && padi.bisaDipanen()) {
            padi.panen();
            pemain.tambahHasilPanen("Padi");
        } else {
            System.out.println("Padi belum bisa dipanen.");
        }
        if (jagung != null && jagung.bisaDipanen()) {
            jagung.panen();
            pemain.tambahHasilPanen("Jagung");
        } else {
            System.out.println("Jagung belum bisa dipanen.");
        }
        if (sawi != null && sawi.bisaDipanen()) {
            sawi.panen();
            pemain.tambahHasilPanen("sawi");
        } else {
            System.out.println("Sawi belum bisa dipanen.");
        }
    }

    public void siramTanaman() {
        if (padi != null) {
            padi.setMenyiram(true);
            System.out.println("Padi telah disiram.");
        }
        if (jagung != null) {
            jagung.setMenyiram(true);
            System.out.println("Jagung telah disiram.");
        }
        if (sawi != null) {
            sawi.setMenyiram(true);
            System.out.println("Sawi telah disiram.");
        }
    }   
}
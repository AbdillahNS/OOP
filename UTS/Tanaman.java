package UTS;

public class Tanaman {
    private String nama;
    private int waktuPanen;
    private int hariTumbuh;
    private boolean menyiram;
    private boolean diberiPupuk;

    public Tanaman(String nama, int waktuPanen) {
        this.nama = nama;
        this.waktuPanen = waktuPanen;
        this.hariTumbuh = 1;
        this.menyiram = false;
        this.diberiPupuk = false;
    }

    public String getNama() {
        return nama;
    }

    public int getWaktuPanen() {
        return waktuPanen;
    }

    public int getHariTumbuh() {
        return hariTumbuh;
    }

    public void setHariTumbuh(int hariTumbuh) {
        this.hariTumbuh += hariTumbuh;
    }

    public boolean getMenyiram() {
        return menyiram;
    }

    public void setMenyiram(boolean menyiram) {
        this.menyiram = menyiram;
    }

    public boolean getDiberiPupuk() {
        return diberiPupuk;
    }

    public void setDiberiPupuk(boolean diberiPupuk) {
        this.diberiPupuk = diberiPupuk;
    }

    public boolean bisaDipanen() {
        return hariTumbuh >= waktuPanen;
    }

    public String getJenisTanaman() {
        return "Tanaman";
    }

    public void statusTanaman() {
        System.out.println(getNama() + " - Hari ke - " + getHariTumbuh() + 
                           " || Status panen: " + (bisaDipanen() ? "Siap Dipanen" : "Belum siap dipanen") +  
                           " || Status menyiram: " + (getMenyiram() ? "Sudah disiram" : "Belum disiram") + 
                           " || Status diberi pupuk: " + (getDiberiPupuk() ? "Sudah diberi pupuk" : "Belum diberi pupuk"));
    }

    public void panen() {
        if (bisaDipanen()) {
            System.out.println(getNama() + " telah dipanen dan siap untuk dijual.");
        } else {
            System.out.println(getNama() + " belum bisa dipanen.");
        }
    }
}
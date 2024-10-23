package UTS;

public abstract class Tanaman {
    private String nama;
    private int waktuPanen;
    protected int hariTumbuh;

    public Tanaman(String nama, int waktuPanen) {
        this.nama = nama;
        this.waktuPanen = waktuPanen;
        this.hariTumbuh = 1;
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

    public boolean bisaDipanen() {
        return hariTumbuh >= waktuPanen;
    }

    public void statusTanaman() {
        System.out.println(getNama() + " - Hari ke - " + getHariTumbuh() + 
                           ", Status panen: " + (bisaDipanen() ? "Siap Dipanen" : "Belum siap dipanen"));
    }

    public void panen() {
        if (bisaDipanen()) {
            System.out.println(getNama() + " telah dipanen dan siap untuk dijual.");
        } else {
            System.out.println(getNama() + " belum bisa dipanen.");
        }
    }

    public abstract String getJenisTanaman();
}

package UTS;

public class Waktu {
    private int hari;
    private String musim;

    public Waktu(int hari) {
        this.hari = hari;
        periksaMusim();
    }

    public int getHari() {
        return hari;
    }

    public String getMusim() {
        return musim;
    }

    public void updateHari(int tambahanHari) {
        this.hari += tambahanHari;
        periksaMusim();
    }

    private void periksaMusim() {
        if (hari >= 1 && hari <= 60) {
            musim = "Musim Semi";
        } else if (hari >= 61 && hari <= 90) {
            musim = "Musim Panas";
        } else if (hari >= 91 && hari <= 210) {
            musim = "Musim Gugur";
        } else {
            musim = "Musim Dingin";
        }
        System.out.println("Saat ini adalah " + musim);
    }
}

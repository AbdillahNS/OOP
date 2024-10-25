package UTS;

public class Cuaca {
    private int suhu;
    private int kelembaban;

    public Cuaca() {
        
    }
    
    public Cuaca(int suhu, int kelembaban) {
        this.suhu = suhu;
        this.kelembaban = kelembaban;
    }

    public int getSuhu() {
        return suhu;
    }
    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }

    public int getKelembaban() {
        return kelembaban;
    }
    public void setKelembaban(int kelembaban) {
        this.kelembaban = kelembaban;
    }

    public void updateCuaca(int suhu, int kelembaban) {
        setSuhu(suhu);
        setKelembaban(kelembaban);
        System.out.println("Kondisi cuaca diperbarui dengan Suhu " + suhu + "°C dan Kelembaban " + kelembaban + "%");
        System.out.println("=============================================================");
    }

    public void pertumbuhanTanaman(Tanaman tanaman) {
        if (suhu < 15) {
            System.out.println(tanaman.getNama() + " tidak tumbuh dengan baik karena suhu terlalu rendah.");
        } else if (suhu > 35) {
            System.out.println(tanaman.getNama() + " tidak tumbuh denganaik karena suhu terlalu tinggi.");
        } else {
            System.out.println(tanaman.getNama() + " tumbuh dengan baik pada suhu " + suhu + "°C.");
        }

        if (kelembaban < 20) {
            System.out.println(tanaman.getNama() + " tidak tumbuh dengan baik karena kelembaban terlalu rendah.\n");
        } else if (kelembaban > 80) {
            System.out.println(tanaman.getNama() + " tidak tumbuh dengan baik karena kelembaban terlalu tinggi.\n");
        } else {
            System.out.println(tanaman.getNama() + " tumbuh dengan baik pada kelembaban " + kelembaban + "%.\n");
        }
    }
}
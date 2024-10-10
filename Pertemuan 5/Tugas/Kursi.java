public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    public Kursi(String nomor) {
        this.nomor = nomor;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public String info() {
        String info = ""; 
        info += "\nNomor Kursi: " + nomor + "\n"; 
        if (this.penumpang != null) { 
            info += "Penumpang: " + penumpang.info() + "\n"; 
        } else {
            info += "Kursi ini kosong\n";
        }
        return info; 
    }
}
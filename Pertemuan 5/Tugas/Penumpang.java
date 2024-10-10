public class Penumpang {
    private String ktp;
    private String nama;

    public Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    public String info() {
        String info = ""; 
        info += "\nNama: " + nama + "\n";
        info += "KTP: " + ktp; 
        return info; 
    }
}
public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil(); 
        m.setNama("Avanza"); 
        m.setBiaya(350000); 
        Sopir s = new Sopir(); 
        s.setNama("John Doe"); 
        s.setBiaya(200000); 
        Pelanggan p = new Pelanggan(); 
        p.setNama("Jane Doe"); 
        p.setMobil(m); 
        p.setSopir(s);
        Penyewaan sewa = new Penyewaan();
        sewa.setHari(2); 
        sewa.setMobil(m);
        sewa.setSopir(s);
        System.out.println("Biaya Total = " + sewa.hitungBiayaTotal(2));
    }
}
package Tugas;

public class Demo {
    public static void main(String[] args) {
        Elektronik elektro1 = new Elektronik();
        Elektronik elektro2 = new Elektronik();
        Mobil mobil1 = new Mobil();
        Buku buku1 = new Buku(); 
        
        elektro1.setMerek("Samsung");
        elektro1.setSaluran(10);
        elektro1.cetakStatus();
        
        elektro2.setMerek("Panasonic");
        elektro2.setSaluran(3);
        elektro2.cetakStatus();

        mobil1.setWarna("Merah");
        mobil1.tambahKecepatan(30);
        mobil1.cetakStatus();

        buku1.setJudul("Harry Potter");
        buku1.setHalaman(50);
        buku1.cetakStatus();
    }
}
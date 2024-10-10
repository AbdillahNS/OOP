package Tugas;

public class Elektronik {
    String merek;
    int saluran;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setSaluran(int newValue) {
        saluran = newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Saluran: " + saluran);
    }
}

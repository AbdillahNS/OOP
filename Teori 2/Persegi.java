public class Persegi {
    int sisi;

    public void dataPersegi(int sisi) {
        this.sisi = sisi;
    }

    public void luasPersegi() {
        int luas = sisi * sisi;
        System.out.println("Luas Persegi = " + luas);
    }

    public void kelilingPersegi() {
        int keliling = 4 * sisi;
        System.out.println("Keliling Persegi = " + keliling);
    }
}
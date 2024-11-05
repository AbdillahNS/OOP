public class Rektor {
    public void beriSertifikatMawapres(IBerprestasi mahasiswa) {
        System.out.println("Saya Rektor, memberikan sertifikat Cumlaude");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("---------------------------------------------");
    }
}
public class KuisMain {
    public static void main(String[] args) {
        Kursus kursus = new Kursus("Pemrograman Java", 500000);
        Instruktur instruktur = new Instruktur("Budi", "Pemrograman");
        Video video = new Video("V001", "Belajar Java Dasar", 60, "Video pengenalan Java", "1080p", "MP4");
        Artikel artikel = new Artikel("A001", "Pengenalan Java", "Pengenalan Java Dasar", "Tutorial", "Lukman");
        Kuis kuis = new Kuis("Q001", "Kuis Java Dasar", "Kuis tentang Java Dasar", "Pilihan Ganda", 10);
        Peserta peserta = new Peserta("Alfin", "Alfin1234@example.com");
        Peserta peserta2 = new Peserta("Dita", "Dita1234@example.com");
        Peserta peserta3 = new Peserta("Leni", "Leni1234@example.com");
        Pembayaran pembayaran = new Pembayaran("Transfer Bank", kursus.getHarga());

        System.out.println("\n╔══════════════════╗");
        System.out.println("║ Informasi Kursus ║");
        System.out.println("╚══════════════════╝");
        kursus.tampilKursus();

        System.out.println("\n╔══════════════════════╗");
        System.out.println("║ Informasi Instruktur ║");
        System.out.println("╚══════════════════════╝");
        instruktur.tampilInstruktur();

        System.out.println("\n╔═══════════════════════════╗");
        System.out.println("║ Instruktur Membuat Konten ║");
        System.out.println("╚═══════════════════════════╝");
        instruktur.buatKonten(video);

        System.out.println("\n╔══════════════════╗");
        System.out.println("║ Informasi Konten ║");
        System.out.println("╚══════════════════╝");
        video.tampilVideo();

        System.out.println("\n╔═══════════════════════════╗");
        System.out.println("║ Instruktur Membuat Konten ║");
        System.out.println("╚═══════════════════════════╝");
        instruktur.buatKonten(artikel);

        System.out.println("\n╔══════════════════╗");
        System.out.println("║ Informasi Konten ║");
        System.out.println("╚══════════════════╝");
        artikel.tampilArtikel();

        System.out.println("\n╔═══════════════════════════╗");
        System.out.println("║ Instruktur Membuat Konten ║");
        System.out.println("╚═══════════════════════════╝");
        instruktur.buatKonten(kuis);

        System.out.println("\n╔══════════════════╗");
        System.out.println("║ Informasi Konten ║");
        System.out.println("╚══════════════════╝");
        kuis.tampilKuis();

        System.out.println("\n╔═══════════════════╗");
        System.out.println("║ Informasi Peserta ║");
        System.out.println("╚═══════════════════╝");
        peserta.tampilPeserta();

        System.out.println("\n╔═══════════════════════╗");
        System.out.println("║ Informasi Pendaftaran ║");
        System.out.println("╚═══════════════════════╝");
        peserta.daftarKursus(kursus);

        System.out.println("\n╔═══════════════════╗");
        System.out.println("║ Informasi Peserta ║");
        System.out.println("╚═══════════════════╝");
        peserta2.tampilPeserta();

        System.out.println("\n╔═══════════════════════╗");
        System.out.println("║ Informasi Pendaftaran ║");
        System.out.println("╚═══════════════════════╝");
        peserta2.daftarKursus(kursus);

        System.out.println("\n╔═══════════════════╗");
        System.out.println("║ Informasi Peserta ║");
        System.out.println("╚═══════════════════╝");
        peserta3.tampilPeserta();

        System.out.println("\n╔═══════════════════════╗");
        System.out.println("║ Informasi Pendaftaran ║");
        System.out.println("╚═══════════════════════╝");
        peserta3.daftarKursus(kursus);

        System.out.println("\n╔══════════════════════╗");
        System.out.println("║ Informasi Pembayaran ║");
        System.out.println("╚══════════════════════╝");
        pembayaran.tampilPembayaran();

        System.out.println("\n╔═══════════════════╗");
        System.out.println("║ Status Pembayaran ║");
        System.out.println("╚═══════════════════╝");
        pembayaran.bayar();
    }
}
public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi{
    public PascaSarjana(String nama) {
        super(nama);
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artiekl di jurnal INTERNASIONAL");
    }
}
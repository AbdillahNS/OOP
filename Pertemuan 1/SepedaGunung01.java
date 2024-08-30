public class SepedaGunung01 extends Sepeda01 {
    private String tipeSuspensi;

    public void setTipeSuspensi(String newValue) {
        tipeSuspensi = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe suspensi: " + tipeSuspensi);
    }
}
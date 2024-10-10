public class MainTugas {
    public static void main(String[] args) {
        Penumpang penumpang1 = new Penumpang("1122334455", "Joko");
        Penumpang penumpang2 = new Penumpang("2233445566", "Siti");

        KeretaApi01 KA = new KeretaApi01("KA Gajayana", "Eksekutif", 2, 3);

        KA.getGerbong(1).setPenumpang(penumpang1, 1);
        KA.getGerbong(1).setPenumpang(penumpang2, 2);

        System.out.println(KA.info());
    }
}
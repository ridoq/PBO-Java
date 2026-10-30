public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN 1 (Constructor Default & Assignment) ===");
        Dosen dosen1 = new Dosen("2541823","rido", 500000, "9q874319");
        // dosen1.nama = "Yansy Ayuningtyas";
        // dosen1.nip = "34329837";
        // dosen1.gaji = 3000000;
        // dosen1.nidn = "1989432439";
        System.out.println(dosen1.getAllInfo());

        System.out.println("=== PENGUJIAN 2 (Constructor Berparameter & super) ===");
        Dosen dosen2 = new Dosen("34329837", "Yansy Ayuningtyas", 3000000, "1989432439");
        System.out.println(dosen2.getAllInfo());
    }
}

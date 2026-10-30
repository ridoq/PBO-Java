public class DemoReservasi {
    public static void main(String[] args) {
        RuangLaboratorium r1 = new RuangLaboratorium("LAB-01", "Lab Rekayasa Perangkat Lunak", 30);
        RuangLaboratorium r2 = new RuangLaboratorium("LAB-02", "Lab Jaringan Komputer", 25);
        RuangLaboratorium r3 = new RuangLaboratorium("LAB-03", "Lab Basis Data", 20);

        System.out.println("=== KONDISI AWAL RUANG LABORATORIUM ===");
        r1.tampilInfo();
        r2.tampilInfo();
        r3.tampilInfo();

        System.out.println("\n=== PENGUJIAN KONDISI BERHASIL ===");
        r1.pesan(25);
        r2.pesan(20);

        System.out.println("\n=== PENGUJIAN KONDISI DITOLAK ===");
        r3.pesan(0);
        r3.pesan(-5);
        r3.pesan(35);
        r1.pesan(10);
        r3.batalkan();

        // r1.setNamaRuang("kasdjsak");

        System.out.println("\n=== PENGUJIAN PEMBATALAN BERHASIL ===");
        r1.batalkan();

        System.out.println("\n=== KONDISI AKHIR RUANG LABORATORIUM ===");
        r1.tampilInfo();
        r2.tampilInfo();
        r3.tampilInfo();
    }
}

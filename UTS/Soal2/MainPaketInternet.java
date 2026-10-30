public class MainPaketInternet {
    public static void main(String[] args) {
        System.out.println("=== DAFTAR 3 PELANGGAN AWAL ===");
        Pelanggan p1 = new Pelanggan("P01", "Taufiqi Ridho Maulana", 5000);
        Pelanggan p2 = new Pelanggan("P02", "Budi Santoso", 800);
        Pelanggan p3 = new Pelanggan("P03", "Siti Aminah", 0);

        p1.cetakInfo();
        p2.cetakInfo();
        p3.cetakInfo();

        System.out.println("\n=== PENGUJIAN: PENGGUNAAN KUOTA BERHASIL ===");
        p1.gunakanKuota(1500);

        System.out.println("\n=== PENGUJIAN: PENGGUNAAN MENGUBAH STATUS MENJADI MENIPIS ===");
        p1.gunakanKuota(2800);

        System.out.println("\n=== PENGUJIAN: PENGGUNAAN MELEBIHI KUOTA DITOLAK ===");
        p2.gunakanKuota(1200);

        System.out.println("\n=== PENGUJIAN: PENGGUNAAN NOL DAN NEGATIF DITOLAK ===");
        p1.gunakanKuota(0);
        p1.gunakanKuota(-200);

        System.out.println("\n=== PENGUJIAN: PENGGUNAAN SAMPAI STATUS HABIS ===");
        p1.gunakanKuota(700);

        System.out.println("\n=== PENGUJIAN: PEMBELIAN KUOTA TAMBAHAN BERHASIL ===");
        p3.beliKuota(2500);
        p2.beliKuota(1000);

        System.out.println("\n=== PENGUJIAN: PEMBELIAN NOL DAN NEGATIF DITOLAK ===");
        p1.beliKuota(0);
        p1.beliKuota(-500);

        System.out.println("\n=== STATUS AKHIR SELURUH PELANGGAN ===");
        p1.cetakInfo();
        p2.cetakInfo();
        p3.cetakInfo();
    }
}

import java.time.LocalDate;

public class DemoKafe {
    public static void main(String[] args) {
        System.out.println("### SISTEM TRANSAKSI PEMESANAN KAFE ###\n");

        // 1. Instansiasi Pegawai (Kasir)
        Pegawai kasir1 = new Pegawai("PEG-001", "Siti Aminah");
        Pegawai kasir2 = new Pegawai("PEG-002", "Budi Santoso");

        // 2. Instansiasi Menu
        Menu menu1 = new Menu("M01", "Espresso Single", "Kopi", 18000);
        Menu menu2 = new Menu("M02", "Caramel Macchiato", "Kopi", 28000);
        Menu menu3 = new Menu("M03", "Matcha Latte", "Non-Kopi", 25000);
        Menu menu4 = new Menu("M04", "Butter Croissant", "Pastry", 22000);
        Menu menu5 = new Menu("M05", "Cheesecake Slice", "Dessert", 32000);

        // 3. Instansiasi Pelanggan
        Pelanggan pelanggan1 = new Pelanggan("CUST-24", "Taufiqi Ridho Maulana", "081234567890");

        // 4. Transaksi Pertama Pelanggan 1
        Pesanan pesanan1 = new Pesanan("ORD-2026-001", LocalDate.now(), kasir1);
        pesanan1.tambahMenu(menu2); // Caramel Macchiato
        pesanan1.tambahMenu(menu4); // Butter Croissant

        // Simpan pesanan1 ke riwayat pelanggan
        pelanggan1.tambahPesanan(pesanan1);

        // 5. Transaksi Kedua Pelanggan 1 (Misal kunjungan hari berikutnya)
        Pesanan pesanan2 = new Pesanan("ORD-2026-002", LocalDate.now().plusDays(1), kasir2);
        pesanan2.tambahMenu(menu1); // Espresso Single
        pesanan2.tambahMenu(menu3); // Matcha Latte
        pesanan2.tambahMenu(menu5); // Cheesecake Slice

        // Simpan pesanan2 ke riwayat pelanggan
        pelanggan1.tambahPesanan(pesanan2);

        // 6. Cetak Ringkasan & Riwayat Pelanggan
        System.out.println(">> Info Entitas Pegawai & Pelanggan:");
        System.out.println(kasir1.getInfo());
        System.out.println(kasir2.getInfo());
        System.out.println(pelanggan1.getInfo());
        System.out.println();

        // Tampilkan seluruh riwayat struk belanja pelanggan
        pelanggan1.tampilkanRiwayat();
    }
}

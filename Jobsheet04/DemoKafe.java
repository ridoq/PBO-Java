import java.time.LocalDate;

public class DemoKafe {
    public static void main(String[] args) {
        System.out.println("### SISTEM TRANSAKSI PEMESANAN KAFE ###\n");

        Pegawai kasir1 = new Pegawai("PEG-001", "Siti Aminah");
        Pegawai kasir2 = new Pegawai("PEG-002", "Budi Santoso");
        Menu menu1 = new Menu("M01", "Espresso Single", "Kopi", 18000);
        Menu menu2 = new Menu("M02", "Caramel Macchiato", "Kopi", 28000);
        Menu menu3 = new Menu("M03", "Matcha Latte", "Non-Kopi", 25000);
        Menu menu4 = new Menu("M04", "Butter Croissant", "Pastry", 22000);
        Menu menu5 = new Menu("M05", "Cheesecake Slice", "Dessert", 32000);

        Pelanggan pelanggan1 = new Pelanggan("CUST-24", "Taufiqi Ridho Maulana", "081234567890");

        Pesanan pesanan1 = new Pesanan("ORD-2026-001", LocalDate.now(), kasir1);
        pesanan1.tambahMenu(menu2); 
        pesanan1.tambahMenu(menu4); 

        pelanggan1.tambahPesanan(pesanan1);

        Pesanan pesanan2 = new Pesanan("ORD-2026-002", LocalDate.now().plusDays(1), kasir2);
        pesanan2.tambahMenu(menu1); 
        pesanan2.tambahMenu(menu3); 
        pesanan2.tambahMenu(menu5); 

        pelanggan1.tambahPesanan(pesanan2);

        System.out.println(">> Info Entitas Pegawai & Pelanggan:");
        System.out.println(kasir1.getInfo());
        System.out.println(kasir2.getInfo());
        System.out.println(pelanggan1.getInfo());
        System.out.println();

        pelanggan1.tampilkanRiwayat();
    }
}

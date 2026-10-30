import java.time.LocalDate;
import java.util.ArrayList;

public class Pesanan {
    private String kodePesanan;
    private LocalDate tanggal;
    private Pegawai kasir;
    private ArrayList<Menu> daftarMenu;

    public Pesanan(String kodePesanan, LocalDate tanggal, Pegawai kasir) {
        this.kodePesanan = kodePesanan;
        this.tanggal = tanggal;
        this.kasir = kasir;
        this.daftarMenu = new ArrayList<Menu>();
    }

    public String getKodePesanan() {
        return kodePesanan;
    }

    public void setKodePesanan(String kodePesanan) {
        this.kodePesanan = kodePesanan;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai getKasir() {
        return kasir;
    }

    public void setKasir(Pegawai kasir) {
        this.kasir = kasir;
    }

    public ArrayList<Menu> getDaftarMenu() {
        return daftarMenu;
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public double hitungTotal() {
        double total = 0;
        for (Menu m : daftarMenu) {
            total += m.getHarga();
        }
        return total;
    }

    public void cetakStruk() {
        System.out.println("==========================================");
        System.out.println("             STRUK PESANAN KAFE           ");
        System.out.println("==========================================");
        System.out.println("Kode Pesanan : " + kodePesanan);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("Kasir        : " + (kasir != null ? kasir.getNama() : "-"));
        System.out.println("------------------------------------------");
        System.out.println("Daftar Menu yang Dipesan:");
        if (daftarMenu.isEmpty()) {
            System.out.println("  (Belum ada menu yang dipilih)");
        } else {
            int no = 1;
            for (Menu m : daftarMenu) {
                System.out.printf("  %d. %-22s Rp %,.0f%n", no++, m.getNamaMenu(), m.getHarga());
            }
        }
        System.out.println("------------------------------------------");
        System.out.printf("TOTAL BAYAR : Rp %,.0f%n", hitungTotal());
        System.out.println("==========================================\n");
    }

    public String getInfo() {
        return String.format("Pesanan %s | Tgl: %s | Total: Rp %,.0f | Kasir: %s",
                kodePesanan, tanggal, hitungTotal(), (kasir != null ? kasir.getNama() : "-"));
    }
}

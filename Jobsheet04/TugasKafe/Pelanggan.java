import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String noHp;
    private ArrayList<Pesanan> riwayatPesanan;

    public Pelanggan(String idPelanggan, String nama, String noHp) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noHp = noHp;
        this.riwayatPesanan = new ArrayList<Pesanan>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public ArrayList<Pesanan> getRiwayatPesanan() {
        return riwayatPesanan;
    }

    public void tambahPesanan(Pesanan pesanan) {
        riwayatPesanan.add(pesanan);
    }

    public void tampilkanRiwayat() {
        System.out.println("==================================================");
        System.out.println("            RIWAYAT PESANAN PELANGGAN            ");
        System.out.println("==================================================");
        System.out.println("ID Pelanggan : " + idPelanggan);
        System.out.println("Nama         : " + nama);
        System.out.println("No HP        : " + noHp);
        System.out.println("Total Order  : " + riwayatPesanan.size() + " kali");
        System.out.println("--------------------------------------------------");
        if (riwayatPesanan.isEmpty()) {
            System.out.println("  (Belum memiliki riwayat transaksi)");
        } else {
            for (Pesanan p : riwayatPesanan) {
                p.cetakStruk();
            }
        }
    }

    public String getInfo() {
        return String.format("Pelanggan [%s] %s (No HP: %s) - %d transaksi",
                idPelanggan, nama, noHp, riwayatPesanan.size());
    }
}

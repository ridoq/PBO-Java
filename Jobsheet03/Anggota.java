public class Anggota {
    private String nomorKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    // Constructor
    public Anggota(String nomorKtp, String nama, int limitPinjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; // Default awal pinjaman adalah 0
    }

    // Getter methods
    public String getNomorKtp() {
        return nomorKtp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method pinjam dengan validasi limit
    public void pinjam(int nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal pinjaman harus lebih dari 0.");
            return;
        }

        if (this.jumlahPinjaman + nominal > this.limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += nominal;
        }
    }

    // Method angsur dengan validasi minimal 10% dari pinjaman saat ini (Tugas 2)
    public void angsur(int nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal angsuran harus lebih dari 0.");
            return;
        }

        // Hitung batas minimal angsuran: 10% dari pinjaman saat ini
        int batasMinimal = (int) Math.ceil(this.jumlahPinjaman * 0.10);

        if (nominal < batasMinimal) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            this.jumlahPinjaman -= nominal;
            if (this.jumlahPinjaman < 0) {
                this.jumlahPinjaman = 0;
            }
        }
    }
}

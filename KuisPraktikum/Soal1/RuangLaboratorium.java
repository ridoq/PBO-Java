public class RuangLaboratorium {
    private String kodeRuang;
    private String namaRuang;
    private int kapasitas;
    private boolean isTersedia;
    private int jumlahPeserta;

    public RuangLaboratorium(String kodeRuang, String namaRuang, int kapasitas) {
        this.kodeRuang = kodeRuang;
        this.namaRuang = namaRuang;
        this.kapasitas = kapasitas;
        this.isTersedia = true;
        this.jumlahPeserta = 0;
    }

    public String getKodeRuang() {
        return kodeRuang;
    }

    public String getNamaRuang() {
        return namaRuang;
    }

    // public void setNamaRuang(String namaRuang) {
    //     if (namaRuang != null && !namaRuang.trim().isEmpty()) {
    //         this.namaRuang = namaRuang;
    //     } else {
    //         System.out.println("[DITOLAK] Nama ruang tidak boleh kosong.");
    //     }
    // }

    public int getKapasitas() {
        return kapasitas;
    }

    public boolean isTersedia() {
        return isTersedia;
    }

    public int getJumlahPeserta() {
        return jumlahPeserta;
    }

    public boolean pesan(int jumlah) {
        if (!this.isTersedia) {
            System.out.println("[DITOLAK] Pemesanan " + this.kodeRuang + " gagal: Ruang sudah dipesan.");
            return false;
        }
        if (jumlah <= 0) {
            System.out.println("[DITOLAK] Pemesanan " + this.kodeRuang + " gagal: Jumlah peserta (" + jumlah + ") harus lebih dari 0.");
            return false;
        }
        if (jumlah > this.kapasitas) {
            System.out.println("[DITOLAK] Pemesanan " + this.kodeRuang + " gagal: Jumlah peserta (" + jumlah + ") melebihi kapasitas ruang (" + this.kapasitas + ").");
            return false;
        }

        this.isTersedia = false;
        this.jumlahPeserta = jumlah;
        System.out.println("[BERHASIL] Pemesanan " + this.kodeRuang + " (" + this.namaRuang + ") berhasil untuk " + jumlah + " peserta.");
        return true;
    }

    public boolean batalkan() {
        if (this.isTersedia) {
            System.out.println("[DITOLAK] Pembatalan " + this.kodeRuang + " gagal: Ruang masih tersedia (belum dipesan).");
            return false;
        }

        this.isTersedia = true;
        this.jumlahPeserta = 0;
        System.out.println("[BERHASIL] Pembatalan " + this.kodeRuang + " berhasil. Ruang kembali tersedia.");
        return true;
    }

    public void tampilInfo() {
        System.out.println("Kode Ruang : " + this.kodeRuang);
        System.out.println("Nama Ruang : " + this.namaRuang);
        System.out.println("Kapasitas  : " + this.kapasitas + " orang");
        System.out.println("Status     : " + (this.isTersedia ? "Tersedia" : "Dipesan (" + this.jumlahPeserta + " peserta)"));
        System.out.println("------------------------------------------");
    }
}

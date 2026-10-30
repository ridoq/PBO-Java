public class PesertaSertifikasi {
    private String nim;
    private String nama;
    private double nilaiPraktik;
    private double nilaiTeori;
    private double nilaiProyek;

    public PesertaSertifikasi(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiPraktik = 0;
        this.nilaiTeori = 0;
        this.nilaiProyek = 0;
    }

    public PesertaSertifikasi(String nim, String nama, double nilaiPraktik, double nilaiTeori, double nilaiProyek) {
        this.nim = nim;
        this.nama = nama;
        setNilaiPraktik(nilaiPraktik);
        setNilaiTeori(nilaiTeori);
        setNilaiProyek(nilaiProyek);
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("[DITOLAK] Nama peserta tidak boleh kosong.");
        }
    }

    public double getNilaiPraktik() {
        return nilaiPraktik;
    }

    public boolean setNilaiPraktik(double nilaiPraktik) {
        if (nilaiPraktik < 0 || nilaiPraktik > 100) {
            System.out.println("[DITOLAK] Gagal set nilai praktik (" + this.nama + "): Nilai " + nilaiPraktik + " di luar rentang 0 - 100.");
            return false;
        }
        this.nilaiPraktik = nilaiPraktik;
        return true;
    }

    public double getNilaiTeori() {
        return nilaiTeori;
    }

    public boolean setNilaiTeori(double nilaiTeori) {
        if (nilaiTeori < 0 || nilaiTeori > 100) {
            System.out.println("[DITOLAK] Gagal set nilai teori (" + this.nama + "): Nilai " + nilaiTeori + " di luar rentang 0 - 100.");
            return false;
        }
        this.nilaiTeori = nilaiTeori;
        return true;
    }

    public double getNilaiProyek() {
        return nilaiProyek;
    }

    public boolean setNilaiProyek(double nilaiProyek) {
        if (nilaiProyek < 0 || nilaiProyek > 100) {
            System.out.println("[DITOLAK] Gagal set nilai proyek (" + this.nama + "): Nilai " + nilaiProyek + " di luar rentang 0 - 100.");
            return false;
        }
        this.nilaiProyek = nilaiProyek;
        return true;
    }

    public double hitungNilaiAkhir() {
        return (this.nilaiPraktik * 0.40) + (this.nilaiTeori * 0.30) + (this.nilaiProyek * 0.30);
    }

    public boolean isLulus() {
        return hitungNilaiAkhir() >= 70 && this.nilaiPraktik >= 60 && this.nilaiTeori >= 60 && this.nilaiProyek >= 60;
    }

    public String getStatusKelulusan() {
        double na = hitungNilaiAkhir();
        if (isLulus()) {
            return "LULUS";
        }
        if (na < 70 && (this.nilaiPraktik < 60 || this.nilaiTeori < 60 || this.nilaiProyek < 60)) {
            return "TIDAK LULUS (Nilai akhir < 70 dan ada nilai komponen < 60)";
        }
        if (na < 70) {
            return "TIDAK LULUS (Nilai akhir di bawah 70)";
        }
        return "TIDAK LULUS (Terdapat nilai komponen di bawah 60)";
    }

    public void tampilHasil() {
        System.out.println("NIM          : " + this.nim);
        System.out.println("Nama Peserta : " + this.nama);
        System.out.println("Nilai Praktik: " + this.nilaiPraktik + " (Bobot 40%)");
        System.out.println("Nilai Teori  : " + this.nilaiTeori + " (Bobot 30%)");
        System.out.println("Nilai Proyek : " + this.nilaiProyek + " (Bobot 30%)");
        System.out.printf("Nilai Akhir  : %.2f\n", hitungNilaiAkhir());
        System.out.println("Status       : " + getStatusKelulusan());
        System.out.println("------------------------------------------");
    }
}

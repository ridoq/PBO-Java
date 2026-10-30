import java.time.LocalDate;

public class Konsultasi {
    private LocalDate tanggal;
    private Pegawai dokter;
    private Pegawai perawat;

    public Konsultasi() {
    }

    public Konsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat) {
        this.tanggal = tanggal;
        this.dokter = dokter;
        this.perawat = perawat;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai getDokter() {
        return dokter;
    }

    public void setDokter(Pegawai dokter) {
        this.dokter = dokter;
    }

    public Pegawai getPerawat() {
        return perawat;
    }

    public void setPerawat(Pegawai perawat) {
        this.perawat = perawat;
    }

    public String getInfo() {
        String info = "\tTanggal: " + tanggal + "\n";
        info += "\tDokter: " + (dokter != null ? dokter.getInfo() : "-") + "\n";
        info += "\tPerawat: " + (perawat != null ? perawat.getInfo() : "-") + "\n";
        return info;
    }
}

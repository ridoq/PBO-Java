import java.time.LocalDate;
import java.util.ArrayList;

public class Pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi> riwayatKonsultasi;

    public Pasien(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<Konsultasi>();
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat) {
        Konsultasi konsultasi = new Konsultasi(tanggal, dokter, perawat);
        riwayatKonsultasi.add(konsultasi);
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("No Rekam Medis: ").append(noRekamMedis).append("\n");
        info.append("Nama Pasien   : ").append(nama).append("\n");
        info.append("Riwayat Konsultasi:\n");
        if (riwayatKonsultasi.isEmpty()) {
            info.append("\tBelum ada riwayat konsultasi.\n");
        } else {
            for (Konsultasi k : riwayatKonsultasi) {
                info.append(k.getInfo()).append("\n");
            }
        }
        return info.toString();
    }
}

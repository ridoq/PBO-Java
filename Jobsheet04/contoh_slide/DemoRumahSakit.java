import java.time.LocalDate;

public class DemoRumahSakit {
    public static void main(String[] args) {
        System.out.println("### SISTEM KONSULTASI RUMAH SAKIT (SLIDE 11) ###\n");

        Pegawai dokter1 = new Pegawai("DOK-01", "dr. Tirta Mandira");
        Pegawai perawat1 = new Pegawai("PRW-01", "Ns. Ratna Sari");

        Pasien pasien1 = new Pasien("RM-2026-001", "Taufiqi Ridho");

        // Menambahkan riwayat konsultasi via method komposisi
        pasien1.tambahKonsultasi(LocalDate.of(2026, 9, 25), dokter1, perawat1);
        pasien1.tambahKonsultasi(LocalDate.now(), dokter1, perawat1);

        System.out.println(pasien1.getInfo());
    }
}

public class DemoSertifikasi {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN VALIDASI NILAI TIDAK VALID ===");
        PesertaSertifikasi pUji = new PesertaSertifikasi("254107060000", "Peserta Uji Coba");
        pUji.setNilaiPraktik(110);
        pUji.setNilaiTeori(-15);
        pUji.setNilaiProyek(105);

        System.out.println("\n=== PENILAIAN PESERTA SERTIFIKASI (MINIMAL 3 HASIL) ===");

        PesertaSertifikasi p1 = new PesertaSertifikasi("254107060058", "Taufiqi Ridho", 85, 80, 85);
        PesertaSertifikasi p2 = new PesertaSertifikasi("254107060002", "Budi Santoso", 65, 65, 65);
        PesertaSertifikasi p3 = new PesertaSertifikasi("254107060003", "Siti Aminah", 90, 55, 85);

        p1.tampilHasil();
        p2.tampilHasil();
        p3.tampilHasil();
    }
}

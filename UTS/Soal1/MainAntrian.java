public class MainAntrian {
    public static void main(String[] args) {
        AntrianLayanan antrian = new AntrianLayanan();

        System.out.println("=== PENGUJIAN 1: PANGGIL SAAT ANTRIAN KOSONG ===");
        antrian.panggilAntrian();
        System.out.println();

        System.out.println("=== PENGUJIAN 2: PENDAFTARAN 4 MAHASISWA ===");
        Mahasiswa m1 = new Mahasiswa("254107060058", "Taufiqi Ridho Maulana");
        Mahasiswa m2 = new Mahasiswa("254107060012", "Budi Santoso");
        Mahasiswa m3 = new Mahasiswa("254107060025", "Siti Aminah");
        Mahasiswa m4 = new Mahasiswa("254107060033", "Dian Pratama");

        Mahasiswa m5 = new Mahasiswa();

        antrian.ambilNomor(m1);
        antrian.ambilNomor(m2);
        antrian.ambilNomor(m3);
        antrian.ambilNomor(m4);
        antrian.ambilNomor(m5);

        antrian.tampilkanSisaAntrian();

        System.out.println("=== PENGUJIAN 3: PANGGIL DUA MAHASISWA (URUTAN FIFO) ===");
        antrian.panggilAntrian();
        antrian.panggilAntrian();

        antrian.tampilkanSisaAntrian();

        System.out.println("=== PENGUJIAN 4: PANGGIL SISA MAHASISWA SAMPAI HABIS ===");
        antrian.panggilAntrian();
        antrian.panggilAntrian();
        antrian.panggilAntrian();

        antrian.tampilkanSisaAntrian();

        System.out.println("=== PENGUJIAN 5: PANGGIL KEMBALI SETELAH SEMUA SELESAI ===");
        antrian.panggilAntrian();
    }
}

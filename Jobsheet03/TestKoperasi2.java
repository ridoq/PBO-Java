public class TestKoperasi2 {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + anggota1.getNama());
        System.out.println("Limit Pinjaman: " + anggota1.getLimitPinjaman());

        // Meminjam 4.000.000
        System.out.println("\nMeminjam uang 4.000.000...");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        // Uji Validasi Tugas 2: Mengangsur 200.000 (Kurang dari 10% -> 10% dari 4.000.000 adalah 400.000)
        System.out.println("\nMembayar angsuran 200.000 (kurang dari 10%)...");
        anggota1.angsur(200000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        // Mengangsur 1.000.000 (Valid, di atas 10%)
        System.out.println("\nMembayar angsuran 1.000.000");
        anggota1.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        // Mengangsur 3.000.000 (Valid, melunasi sisa pinjaman)
        System.out.println("\nMembayar angsuran 3.000.000");
        anggota1.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());
    }
}

public class MahasiswaDemo {
    public static void main(String[] args) {
        // 1. Instansiasi Objek Pertama (sesuai modul jobsheet)
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        System.out.println("=== BIODATA MAHASISWA 1 ===");
        m1.displayBiodata();

        // 2. Instansiasi 2 Objek Mahasiswa Baru (sesuai langkah 12)
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "254107060058";
        m2.nama = "Taufiqi Ridho Maulana";
        m2.alamat = "Kota Malang";
        m2.kelas = "SIB 2D";

        System.out.println("\n=== BIODATA MAHASISWA 2 ===");
        m2.displayBiodata();

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "254107060065";
        m3.nama = "Rafi' Denia Akmalludien";
        m3.alamat = "Kota Surabaya";
        m3.kelas = "SIB 2D";

        System.out.println("\n=== BIODATA MAHASISWA 3 ===");
        m3.displayBiodata();
    }
}

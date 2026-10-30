public class MainMahasiswa24 {
    public static void main(String[] args) {
        System.out.println("=====================");
        System.out.println("     ENKAPSULASI     ");
        Mahasiswa24 mhs1 = new Mahasiswa24("254107060058", "Taufiqi Ridho Maulana", "Malang", 4.00);
        Mahasiswa24 mhs2 = new Mahasiswa24("254107060099", "Prayu Kiyat Nurwulandari", "Bondowoso", 3.90);
        System.out.println("=====================");
        System.out.println("       GETTER        ");
        System.out.println("Mahasiswa 1: ");
        System.out.println("NIM    : " + mhs1.getNim());
        System.out.println("Nama   : " + mhs1.getNama());
        System.out.println("Alamat : " + mhs1.getAlamat());
        System.out.printf("IPK    : %.2f\n\n", mhs1.getIpk());
        System.out.println("Mahasiswa 2:");
        System.out.println("NIM    : " + mhs2.getNim());
        System.out.println("Nama   : " + mhs2.getNama());
        System.out.println("Alamat : " + mhs2.getAlamat());
        System.out.printf("IPK    : %.2f\n\n", mhs2.getIpk());
        System.out.println("=====================");
        System.out.println("       SETTER        ");
        System.out.println("Mengubah data Mahasiswa 1...");
        mhs1.setNama("Taufiqi Ridho M., S.Tr.Kom.");
        mhs1.setAlamat("Kota Malang (Jawa Timur)");
        mhs1.setIpk(3.95);
        System.out.println("Data Mahasiswa 1 setelah diubah via setter:");
        System.out.println("NIM    : " + mhs1.getNim() + " (NIM tetap aman / Read-Only)");
        System.out.println("Nama   : " + mhs1.getNama());
        System.out.println("Alamat : " + mhs1.getAlamat());
        System.out.printf("IPK    : %.2f\n\n", mhs1.getIpk());
        // validasi ipk
        System.out.println("Coba IPK: 4.75");
        mhs1.setIpk(4.75); 
        System.out.println("Coba IPK: -1.25");
        mhs1.setIpk(-1.25);
        System.out.printf("Coba tampilin: %.2f\n\n", mhs1.getIpk());
        // test private atribut
        // System.out.println("test private atribut");
        // mhs1.nim = "254107060000";
        //harusnya error
    }
}

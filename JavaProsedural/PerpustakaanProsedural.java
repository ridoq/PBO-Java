import java.util.Scanner;

public class PerpustakaanProsedural {
    static Scanner sc = new Scanner(System.in);
    
    static String[] idBuku = new String[100];
    static String[] judulBuku = new String[100];
    static String[] penulisBuku = new String[100];
    static String[] statusBuku = new String[100]; 
    static int jumlahBuku = 0;

    static String[] idAnggota = new String[100];
    static String[] namaAnggota = new String[100];
    static int[] dendaAnggota = new int[100];
    static int jumlahAnggota = 0;

    public static void main(String[] args) {
        // Data Dummy Buku dan Anggota
        tambahBuku("B001", "Laskar Pelangi", "Andrea Hirata");
        tambahBuku("B002", "Bumi Manusia", "Pramoedya");
        tambahAnggota("A001", "Budi");
        tambahAnggota("A002", "Sari");

        boolean isRunning = true;
        while (isRunning) {
            tampilkanMenu();
            int pilihan = sc.nextInt();
            sc.nextLine(); //untuk clear buffer

            switch (pilihan) {
                case 1:
                    menuTambahBuku();
                    break;
                case 2:
                    menuTambahAnggota();
                    break;
                case 3:
                    tampilkanSemuaBuku();
                    break;
                case 4:
                    tampilkanSemuaAnggota();
                    break;
                case 5:
                    menuPinjamBuku();
                    break;
                case 6:
                    menuKembalikanBuku();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void tampilkanMenu() {
        System.out.println("\n=== SISTEM MANAJEMEN PERPUSTAKAAN ===");
        System.out.println("1. Tambah Buku Baru");
        System.out.println("2. Tambah Anggota Baru");
        System.out.println("3. Lihat Daftar Buku");
        System.out.println("4. Lihat Daftar Anggota");
        System.out.println("5. Pinjam Buku");
        System.out.println("6. Kembalikan Buku");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void menuTambahBuku() {
        System.out.print("Masukkan ID Buku: ");
        String id = sc.nextLine();
        if (cariIndexBuku(id) != -1) {
            System.out.println("GAGAL! ID Buku '" + id + "' sudah terdaftar di sistem.");
            return; 
        }
        System.out.print("Masukkan Judul Buku: ");
        String judul = sc.nextLine();
        System.out.print("Masukkan Penulis Buku: ");
        String penulis = sc.nextLine();

        tambahBuku(id, judul, penulis);
        System.out.println("Buku berhasil ditambahkan!");
    }

    public static void tambahBuku(String id, String judul, String penulis) {
        idBuku[jumlahBuku] = id;
        judulBuku[jumlahBuku] = judul;
        penulisBuku[jumlahBuku] = penulis;
        statusBuku[jumlahBuku] = "Tersedia";
        jumlahBuku++;
    }
    
    public static void menuTambahAnggota() {
        System.out.print("Masukkan ID Anggota: ");
        String id = sc.nextLine();
        if (cariIndexAnggota(id) != -1) {
            System.out.println("GAGAL! ID Anggota '" + id + "' sudah terdaftar di sistem.");
            return;
        }
        System.out.print("Masukkan Nama Anggota: ");
        String nama = sc.nextLine();

        tambahAnggota(id, nama);
        System.out.println("Anggota berhasil ditambahkan!");
    }

    public static void tambahAnggota(String id, String nama) {
        idAnggota[jumlahAnggota] = id;
        namaAnggota[jumlahAnggota] = nama;
        dendaAnggota[jumlahAnggota] = 0;
        jumlahAnggota++;
    }


    public static void tampilkanSemuaBuku() {
        System.out.println("\n--- DAFTAR BUKU ---");
        System.out.printf("%-6s %-20s %-20s %-12s\n", "ID", "Judul", "Penulis", "Status");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.printf("%-6s %-20s %-20s %-12s\n", idBuku[i], judulBuku[i], penulisBuku[i], statusBuku[i]);
        }
    }

    public static void tampilkanSemuaAnggota() {
        System.out.println("\n--- DAFTAR ANGGOTA ---");
        System.out.printf("%-6s %-20s %-10s\n", "ID", "Nama", "Denda (Rp)");
        System.out.println("-------------------------------------");
        for (int i = 0; i < jumlahAnggota; i++) {
            System.out.printf("%-6s %-20s %-10d\n", idAnggota[i], namaAnggota[i], dendaAnggota[i]);
        }
    }

    public static void menuPinjamBuku() {
        System.out.print("Masukkan ID Anggota: ");
        String idA = sc.nextLine();
        System.out.print("Masukkan ID Buku yang dipinjam: ");
        String idB = sc.nextLine();

        int idxAnggota = cariIndexAnggota(idA);
        int idxBuku = cariIndexBuku(idB);

        if (idxAnggota != -1 && idxBuku != -1) { //ini untuk ngecek apakah anggota dan buku tersedia di array
            if (statusBuku[idxBuku].equals("Tersedia")) {
                if (dendaAnggota[idxAnggota] == 0) {
                    statusBuku[idxBuku] = "Dipinjam";
                    System.out.println("Buku '" + judulBuku[idxBuku] + "' berhasil dipinjam oleh " + namaAnggota[idxAnggota]);
                } else {
                    System.out.println("GAGAL! Anggota memiliki denda belum lunas sebesar Rp" + dendaAnggota[idxAnggota]);
                }
            } else {
                System.out.println("GAGAL! Buku sedang tidak tersedia.");
            }
        } else {
            System.out.println("ID Anggota atau ID Buku tidak ditemukan!");
        }
    }

    public static void menuKembalikanBuku() {
        System.out.print("Masukkan ID Buku yang dikembalikan: ");
        String idB = sc.nextLine();
        System.out.print("Terlambat mengembalikan? (hari, 0 jika tepat waktu): ");
        int hariTerlambat = sc.nextInt();
        sc.nextLine(); 

        int idxBuku = cariIndexBuku(idB);
        if (idxBuku != -1 && statusBuku[idxBuku].equals("Dipinjam")) {
            statusBuku[idxBuku] = "Tersedia";
            
            int denda = hariTerlambat * 1000;
            if (denda > 0) {
                System.out.print("Masukkan ID Anggota peminjam untuk update denda: ");
                String idA = sc.nextLine();
                int idxAnggota = cariIndexAnggota(idA);
                if(idxAnggota != -1){
                    dendaAnggota[idxAnggota] += denda;
                    System.out.println("Denda Rp" + denda + " ditambahkan ke " + namaAnggota[idxAnggota]);
                }
            }
            System.out.println("Buku berhasil dikembalikan.");
        } else {
            System.out.println("Buku tidak ditemukan atau memang sedang tersedia.");
        }
    }

    public static int cariIndexBuku(String id) {
        for (int i = 0; i < jumlahBuku; i++) {
            if (idBuku[i].equals(id)) return i;
        }
        return -1;
    }

    public static int cariIndexAnggota(String id) {
        for (int i = 0; i < jumlahAnggota; i++) {
            if (idAnggota[i].equals(id)) return i;
        }
        return -1;
    }
}
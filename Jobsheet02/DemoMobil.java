public class DemoMobil {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   TUGAS 2: IMPLEMENTASI CLASS TEORI (MOBIL)  ");
        System.out.println("==============================================\n");

        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil();
        Mobil mobil3 = new Mobil();

        mobil1.tambahMobil("Honda", "Civic RS", 220, 2024, 600000000, 1, 47.0);
        mobil2.tambahMobil("Toyota", "Innova Zenix", 185, 2023, 420000000, 1, 52.0);
        mobil3.tambahMobil("bmw", "m3 gtr", 230, 2026, 420000000, 1, 52.0);

        System.out.println("\n--- Data Awal Objek ---");
        mobil1.tampilMobil();
        System.out.println();
        mobil2.tampilMobil();
        System.out.println();
        mobil3.tampilMobil();

        System.out.println("\n--- Update Nilai Atribut Setiap Objek ---");
        mobil1.updateMobil(615000000, 2);
        mobil2.updateMobil(430000000, 3);

        System.out.println("\n--- Eksekusi Method Efisiensi Konsumsi BBM ---");
        mobil1.rataRataPemakaianBensinPerKecepatan(180.0, 12.0);
        mobil2.rataRataPemakaianBensinPerKecepatan(200.0, 15.0);

        System.out.println("\n--- Data Akhir Setelah Update ---");
        mobil1.tampilMobil();
        System.out.println();
        mobil2.tampilMobil();
    }
}

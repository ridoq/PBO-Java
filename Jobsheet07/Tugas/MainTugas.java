public class MainTugas {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN 1: OBJEK MOBIL CONSTRUCTOR DEFAULT ===");
        Mobil mobil1 = new Mobil();
        mobil1.cetakInfo();

        System.out.println("\n=== PENGUJIAN 2: OBJEK MOBIL CONSTRUCTOR BERPARAMETER ===");
        Mobil mobil2 = new Mobil("Honda Civic Type R", "Championship White", 2024, 4);
        mobil2.cetakInfo();
    }
}

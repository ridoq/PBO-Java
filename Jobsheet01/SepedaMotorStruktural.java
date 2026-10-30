public class SepedaMotorStruktural {

    public static int tambahKecepatan(int kecepatanSekarang, int pertambahan) {
        kecepatanSekarang += pertambahan;
        System.out.println("Kecepatan bertambah menjadi: " + kecepatanSekarang + " km/jam");
        return kecepatanSekarang;
    }

    public static int kurangiKecepatan(int kecepatanSekarang, int pengurangan) {
        kecepatanSekarang -= pengurangan;
        if (kecepatanSekarang < 0) kecepatanSekarang = 0;
        System.out.println("Kecepatan berkurang menjadi: " + kecepatanSekarang + " km/jam");
        return kecepatanSekarang;
    }

    public static int gantiGear(int gearSekarang, int gearBaru) {
        gearSekarang = gearBaru;
        System.out.println("Gear berpindah ke posisi: " + gearSekarang);
        return gearSekarang;
    }

    public static void main(String[] args) {
        System.out.println("=== PRAKTIKUM 1: PEMROGRAMAN STRUKTURAL 10 OBJEK ===");
        System.out.println("Kategori Objek: Sepeda Motor\n");

        String merek1 = "Honda Beat";int kecepatan1 = 40;int gear1 = 1;
        String merek2 = "Yamaha NMAX";int kecepatan2 = 60;int gear2 = 2;
        String merek3 = "Suzuki Satria";int kecepatan3 = 80;int gear3 = 4;
        String merek4 = "Honda Vario";int kecepatan4 = 50;int gear4 = 2;
        String merek5 = "Yamaha Aerox";int kecepatan5 = 70;int gear5 = 3;
        String merek6 = "Kawasaki Ninja";int kecepatan6 = 100;int gear6 = 5;
        String merek7 = "Honda CBR150R";int kecepatan7 = 85;int gear7 = 4;
        String merek8 = "Vespa Primavera";int kecepatan8 = 45;int gear8 = 1;
        String merek9 = "Yamaha R15";int kecepatan9 = 90;int gear9 = 5;
        String merek10 = "Suzuki GSX-R150";int kecepatan10 = 95;int gear10 = 5;
        System.out.println("--- DAFTAR 10 OBJEK SEPEDA MOTOR ---");
        System.out.println("1.  " + merek1 + " | Kecepatan: " + kecepatan1 + " km/jam | Gear: " + gear1);
        System.out.println("2.  " + merek2 + " | Kecepatan: " + kecepatan2 + " km/jam | Gear: " + gear2);
        System.out.println("3.  " + merek3 + " | Kecepatan: " + kecepatan3 + " km/jam | Gear: " + gear3);
        System.out.println("4.  " + merek4 + " | Kecepatan: " + kecepatan4 + " km/jam | Gear: " + gear4);
        System.out.println("5.  " + merek5 + " | Kecepatan: " + kecepatan5 + " km/jam | Gear: " + gear5);
        System.out.println("6.  " + merek6 + " | Kecepatan: " + kecepatan6 + " km/jam | Gear: " + gear6);
        System.out.println("7.  " + merek7 + " | Kecepatan: " + kecepatan7 + " km/jam | Gear: " + gear7);
        System.out.println("8.  " + merek8 + " | Kecepatan: " + kecepatan8 + " km/jam | Gear: " + gear8);
        System.out.println("9.  " + merek9 + " | Kecepatan: " + kecepatan9 + " km/jam | Gear: " + gear9);
        System.out.println("10. " + merek10 + " | Kecepatan: " + kecepatan10 + " km/jam | Gear: " + gear10);

        System.out.println("\n--- PENGUJIAN FUNGSI PADA OBJEK 1 (" + merek1 + ") ---");
        kecepatan1 = tambahKecepatan(kecepatan1, 20);
        gear1 = gantiGear(gear1, 2);
        kecepatan1 = kurangiKecepatan(kecepatan1, 15);

        System.out.println("\n--- PENGUJIAN FUNGSI PADA OBJEK 6 (" + merek6 + ") ---");
        kecepatan6 = tambahKecepatan(kecepatan6, 30);
        gear6 = gantiGear(gear6, 6);
        kecepatan6 = kurangiKecepatan(kecepatan6, 40);
    }
}

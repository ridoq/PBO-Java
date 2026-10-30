public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50); // Akan tertolak karena mesin belum On
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 9827 UT");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(40); // Berhasil karena mesin sudah On
        motor2.displayStatus();

        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60); // Akan tertolak karena mesin belum On
        motor3.displayStatus();

        // Pengujian modifikasi Pertanyaan Percobaan 2 (Soal 4 & 5: Max 100 & Non-Negatif)
        System.out.println("--- Pengujian Batas Kecepatan (Soal 4 & 5) ---");
        motor2.setKecepatan(120); // Melebihi 100 km/jam
        motor2.displayStatus();

        motor2.setKecepatan(-10); // Negatif
        motor2.displayStatus();
    }
}

public class MotorDemo1 {
    public static void main(String[] args) {
        Motor1 motor1 = new Motor1();
        motor1.platNomor = "B 0838 XZ";
        motor1.kecepatan = 50; // Kejanggalan: Mesin masih Off tapi kecepatan sudah 50
        motor1.displayStatus();

        Motor1 motor2 = new Motor1();
        motor2.platNomor = "N 9827 UT";
        motor2.isMesinOn = true;
        motor2.kecepatan = 40;
        motor2.displayStatus();

        Motor1 motor3 = new Motor1();
        motor3.platNomor = "D 8343 CV";
        motor3.kecepatan = 60; // Kejanggalan kedua
        motor3.displayStatus();
    }
}
    
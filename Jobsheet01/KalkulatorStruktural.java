import java.util.Scanner;

public class KalkulatorStruktural {

    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan angka 0 tidak terdefinisi");
            return Double.NaN;
        }
        return a / b;
    }

    public static double modulo(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Modulo dengan angka 0 tidak terdefinisi");
            return Double.NaN;
        }
        return a % b;
    }

     public static void main(String[] args) {                                                                                                            
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- KALKULATOR STRUKTURAL -----");

        boolean isTrue = true;

        do {
            try {
                System.out.print("\nMasukkan Angka ke-1 : ");
                double angka1 = Double.parseDouble(scanner.next().replaceAll("[^0-9.-]", ""));

                System.out.print("Masukkan Operator (+, -, *, /, %) : ");
                char operator = scanner.next().trim().charAt(0);

                System.out.print("Masukkan Angka ke-2 : ");
                double angka2 = Double.parseDouble(scanner.next().replaceAll("[^0-9.-]", ""));

                double hasil = 0;
                boolean valid = true;

                switch (operator) {
                    case '+':
                        hasil = tambah(angka1, angka2);
                        break;
                    case '-':
                        hasil = kurang(angka1, angka2);
                        break;
                    case '*':
                        hasil = kali(angka1, angka2);
                        break;
                    case '/':
                        hasil = bagi(angka1, angka2);
                        break;
                    case '%':
                        hasil = modulo(angka1, angka2);
                        break;
                    default:
                        System.out.println("Error: Operator tidak valid!");
                        valid = false;
                }

                // Kalau operasi valid dan hasil bukan NaN, tampilkan hasil dan stop perulangan
                if (valid && !Double.isNaN(hasil)) {
                    System.out.println(">>> HASIL PERHITUNGAN: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
                    isTrue = false; 
                } else {
                    System.out.println("Silakan coba masukkan kembali dengan benar!\n");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Input harus berupa angka valid! Silakan ulangi.");
            }

        } while (isTrue);

        scanner.close();
    }
}

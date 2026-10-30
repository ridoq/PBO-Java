public class DemoPersegi {
    public static void main(String[] args) {
        // PersegiPanjang pp1 = new PersegiPanjang();
        // PersegiPanjang pp2 = new PersegiPanjang();

        PersegiPanjang pp3 = new PersegiPanjang(25, 10);

        // pp1.panjang = 10;
        // pp1.lebar = 5;
        // pp2.panjang = 12;
        // pp2.lebar = 6;
        
        pp3.displayInfo();
        System.out.println(pp3.getKeliling());
        
        // System.out.println("=== DATA PERSEGI PANJANG ===");
        // System.out.println("Luas     : " + pp1.getLuas());
        // System.out.println("Keliling : " + pp1.getKeliling());

        // System.out.println("=== DATA PERSEGI PANJANG 2 ===");
        // pp2.displayInfo();
        // System.out.println("Luas     : " + pp2.getLuas());
        // System.out.println("Keliling : " + pp2.getKeliling());
    }
}

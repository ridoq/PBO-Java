public class Motor1 {
    public String platNomor;
    public boolean isMesinOn;
    public int kecepatan;

    public void displayStatus() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Status Mesin: " + (isMesinOn ? "On" : "Off"));
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("=======================");
    }
}

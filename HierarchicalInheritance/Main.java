public class Main {
    public static void main(String[] args) {
        System.out.println("=== DATA MANAGER ===");
        Manager mgr = new Manager("MGR-001", "Budi Santoso", 8000000, 3500000);
        mgr.cetakInfo();

        System.out.println("\n=== DATA PROGRAMMER ===");
        Programmer prg = new Programmer("PRG-002", "Taufiqi Ridho", 6500000, 2000000);
        prg.cetakInfo();
    }
}

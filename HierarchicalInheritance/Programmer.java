public class Programmer extends Karyawan {
    private double bonusProyek;

    public Programmer(String nip, String nama, double gajiPokok, double bonusProyek) {
        super(nip, nama, gajiPokok);
        this.bonusProyek = bonusProyek;
    }

    public double hitungTotalGaji() {
        return this.gajiPokok + this.bonusProyek;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Bonus Proyek: Rp " + (long) this.bonusProyek);
        System.out.println("Total Gaji  : Rp " + (long) hitungTotalGaji());
    }
}

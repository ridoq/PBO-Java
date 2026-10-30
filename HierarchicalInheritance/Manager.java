public class Manager extends Karyawan {
    private double tunjanganJabatan;

    public Manager(String nip, String nama, double gajiPokok, double tunjanganJabatan) {
        super(nip, nama, gajiPokok);
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public double hitungTotalGaji() {
        return this.gajiPokok + this.tunjanganJabatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tunjangan   : Rp " + (long) this.tunjanganJabatan);
        System.out.println("Total Gaji  : Rp " + (long) hitungTotalGaji());
    }
}

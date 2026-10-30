public class Karyawan {
    protected String nip;
    protected String nama;
    protected double gajiPokok;

    public Karyawan(String nip, String nama, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void cetakInfo() {
        System.out.println("NIP         : " + this.nip);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Gaji Pokok  : Rp " + (long) this.gajiPokok);
    }
}

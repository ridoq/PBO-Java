public class Kendaraan {
    protected String merk;
    protected String warna;
    protected int tahunProduksi;

    // Overloaded Constructor 1: Tanpa Parameter (Default)
    public Kendaraan() {
        this.merk = "Belum Diisi";
        this.warna = "Belum Diisi";
        this.tahunProduksi = 0;
    }

    // Overloaded Constructor 2: Berparameter
    public Kendaraan(String merk, String warna, int tahunProduksi) {
        this.merk = merk;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    // Method yang akan di-override di subclass
    public void cetakInfo() {
        System.out.println("Merk           : " + this.merk);
        System.out.println("Warna          : " + this.warna);
        System.out.println("Tahun Produksi : " + this.tahunProduksi);
    }
}

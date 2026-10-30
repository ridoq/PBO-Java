public class Kendaraan {
    protected String merk;
    protected String warna;
    protected int tahunProduksi;

    public Kendaraan() {
        this.merk = "Belum Diisi";
        this.warna = "Belum Diisi";
        this.tahunProduksi = 0;
    }

    public Kendaraan(String merk, String warna, int tahunProduksi) {
        this.merk = merk;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    public void cetakInfo() {
        System.out.println("Merk           : " + this.merk);
        System.out.println("Warna          : " + this.warna);
        System.out.println("Tahun Produksi : " + this.tahunProduksi);
    }
}

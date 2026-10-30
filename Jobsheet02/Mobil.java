public class Mobil {
    public String merk;
    public String model;
    public int kecepatanMaksimal;
    public int tahunPeluncuran;
    public double harga;
    public int gigi;
    public double kapasitasBensin;

    public void tambahMobil(String merk, String model, int 
        kecepatanMaksimal, int tahunPeluncuran, double harga, int gigi, double kapasitasBensin) {
        this.merk = merk;
        this.model = model;
        this.kecepatanMaksimal = kecepatanMaksimal;
        this.tahunPeluncuran = tahunPeluncuran;
        this.harga = harga;
        this.gigi = gigi;
        this.kapasitasBensin = kapasitasBensin;
        System.out.println("-> Mobil " + this.merk + " " + this.model + " berhasil didaftarkan.");
    }

    public void updateMobil(double hargaBaru, int gigiBaru) {
        this.harga = hargaBaru;
        this.gigi = gigiBaru;
        System.out.println("-> Mobil " + this.merk + " diperbarui: Harga Rp" + String.format("%,.0f", this.harga) + ", Gigi " + this.gigi);
    }

    public void tampilMobil() {
        System.out.println("[DATA MOBIL]" + this.merk + "" + this.model);
        System.out.println("  Kecepatan Max : " + this.kecepatanMaksimal + " km/jam");
        System.out.println("  Tahun Rilis   : " + this.tahunPeluncuran);
        System.out.println("  Harga         : Rp " + String.format("%,.0f", this.harga));
        System.out.println("  Posisi Gigi   : " + this.gigi);
        System.out.println("  Kapasitas BBM : " + this.kapasitasBensin + " Liter");
    }

    public double rataRataPemakaianBensinPerKecepatan(double jarakKm, double bensinLiter) {
        if (bensinLiter <= 0) return 0;
        double efisiensi = jarakKm / bensinLiter;
        System.out.println("-> Efisiensi BBM " + this.merk + ": " + String.format("%.2f", efisiensi) + " km/liter");
        return efisiensi;
    }
}

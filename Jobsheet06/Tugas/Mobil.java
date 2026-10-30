public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil() {
        super();
        this.jumlahPintu = 0;
    }

    public Mobil(String merk, String warna, int tahunProduksi, int jumlahPintu) {
        super(merk, warna, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Pintu   : " + this.jumlahPintu);
    }
}

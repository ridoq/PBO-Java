public class Mobil extends Kendaraan {
    private int jumlahPintu;

    // Overloaded Constructor 1: Tanpa Parameter (Default)
    public Mobil() {
        super(); // Memanggil constructor default superclass
        this.jumlahPintu = 0;
    }

    // Overloaded Constructor 2: Berparameter lengkap
    public Mobil(String merk, String warna, int tahunProduksi, int jumlahPintu) {
        super(merk, warna, tahunProduksi); // Memanggil constructor superclass berparameter di baris pertama
        this.jumlahPintu = jumlahPintu;
    }

    // Method Overriding: Mengimplementasikan ulang cetakInfo dari superclass Kendaraan
    @Override
    public void cetakInfo() {
        super.cetakInfo(); // Memanggil implementasi cetakInfo milik superclass
        System.out.println("Jumlah Pintu   : " + this.jumlahPintu);
    }
}

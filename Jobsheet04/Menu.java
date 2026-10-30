public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private String kategori;
    private double harga;

    public Menu(String kodeMenu, String namaMenu, String kategori, double harga) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.kategori = kategori;
        this.harga = harga;
    }

    public String getKodeMenu() {
        return kodeMenu;
    }

    public void setKodeMenu(String kodeMenu) {
        this.kodeMenu = kodeMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getInfo() {
        return String.format("[%s] %s (%s) - Rp %,.0f", kodeMenu, namaMenu, kategori, harga);
    }
}

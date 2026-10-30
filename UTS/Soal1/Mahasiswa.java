public class Mahasiswa {
    private final String nim;
    private final String nama;
    private int nomorAntrian;
    private String statusAntrian;

    public Mahasiswa(){
        nim = "belum ditentukan";
        nama = "belum ditentukan";
        nomorAntrian = 0;
        statusAntrian = "BELUM TERDAFTAR";
    }
    
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nomorAntrian = 0;
        this.statusAntrian = "BELUM TERDAFTAR";
    }
    
    public String getNim() {
        return nim;
    }
    

    public String getNama() {
        return nama;
    }

    public int getNomorAntrian() {
        return nomorAntrian;
    }

    public String getStatusAntrian() {
        return statusAntrian;
    }

    void setNomorAntrian(int nomorAntrian) {
        this.nomorAntrian = nomorAntrian;
    }

    void setStatusAntrian(String statusAntrian) {
        this.statusAntrian = statusAntrian;
    }

    @Override
    public String toString() {
        return nama + " (" + nim + ")";
    }
}

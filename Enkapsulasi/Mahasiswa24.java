public class Mahasiswa24 {
    private String nim, nama, alamat;
    private double ipk;

    public Mahasiswa24(String nim, String nama, String alamat, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        setIpk(ipk); 
    }
    public String getNim() {return this.nim;}
    public String getNama() {return this.nama;}
    public String getAlamat() {return this.alamat;}
    public double getIpk() {return this.ipk;}
    public void setNama(String nama) {this.nama = nama;}
    public void setAlamat(String alamat) {this.alamat = alamat;}
    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("[Peringatan Validasi] Nilai IPK " + ipk + " tidak valid! IPK harus berada pada rentang 0.00 - 4.00.");
        }
    }
    public void cetakInfo() {
        System.out.println("----------------------------------------");
        System.out.println("NIM    : " + this.nim);
        System.out.println("Nama   : " + this.nama);
        System.out.println("Alamat : " + this.alamat);
        System.out.printf("IPK    : %.2f\n", this.ipk);
        System.out.println("----------------------------------------");
    }
}
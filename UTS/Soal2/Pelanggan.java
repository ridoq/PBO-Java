public class Pelanggan {
    private final String idPelanggan;
    private final String nama;
    private int kuotaMB;

    public Pelanggan(String idPelanggan, String nama, int kuotaAwalMB) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.kuotaMB = Math.max(0, kuotaAwalMB);
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public int getKuotaMB() {
        return kuotaMB;
    }

    public String getStatusKuota() {
        if (kuotaMB == 0) {
            return "HABIS";
        } else if (kuotaMB <= 1000) {
            return "MENIPIS";
        } else {
            return "CUKUP";
        }
    }

    public boolean gunakanKuota(int jumlahMB) {
        System.out.println("\n[Penggunaan Kuota] " + nama + " (" + idPelanggan + ")");
        System.out.println("Kuota Sebelum : " + kuotaMB + " MB (Status: " + getStatusKuota() + ")");
        System.out.println("Jumlah Diminta: " + jumlahMB + " MB");

        if (jumlahMB <= 0) {
            System.out.println("Pesan Ditolak : Jumlah penggunaan kuota harus bernilai positif.");
            System.out.println("Kuota Sesudah : " + kuotaMB + " MB (Status: " + getStatusKuota() + ")");
            return false;
        }

        if (jumlahMB > kuotaMB) {
            System.out.println("Pesan Ditolak : Kuota tidak mencukupi untuk penggunaan " + jumlahMB + " MB.");
            System.out.println("Kuota Sesudah : " + kuotaMB + " MB (Status: " + getStatusKuota() + ")");
            return false;
        }

        kuotaMB -= jumlahMB;
        System.out.println("Status Proses : Berhasil.");
        System.out.println("Kuota Sesudah : " + kuotaMB + " MB (Status: " + getStatusKuota() + ")");
        return true;
    }

    public boolean beliKuota(int tambahanMB) {
        System.out.println("\n[Pembelian Kuota] " + nama + " (" + idPelanggan + ")");
        System.out.println("Kuota Sebelum : " + kuotaMB + " MB (Status: " + getStatusKuota() + ")");
        System.out.println("Jumlah Beli   : " + tambahanMB + " MB");

        if (tambahanMB <= 0) {
            System.out.println("Pesan Ditolak : Jumlah pembelian kuota harus bernilai positif.");
            System.out.println("Kuota Sesudah : " + kuotaMB + " MB (Status: " + getStatusKuota() + ")");
            return false;
        }

        kuotaMB += tambahanMB;
        System.out.println("Status Proses : Berhasil.");
        System.out.println("Kuota Sesudah : " + kuotaMB + " MB (Status: " + getStatusKuota() + ")");
        return true;
    }

    public void cetakInfo() {
        System.out.println("Pelanggan: " + idPelanggan + " - " + nama + " | Kuota: " + kuotaMB + " MB | Status: " + getStatusKuota());
    }
}

# 🏥 Kode & Hasil Praktikum: Percobaan 1 — PBO Jobsheet 04 (Relasi Kelas)

**Nama Mahasiswa :** Taufiqi Ridho Maulana  
**NIM            :** 254107060058  
**Kelas          :** SIB 2D / D4 Sistem Informasi Bisnis  
**Mata Kuliah    :** Pemrograman Berbasis Objek (PBO)  
**Materi         :** Jobsheet 04 — Relasi Kelas (Asosiasi, Agregasi, & Komposisi)  
**Studi Kasus    :** Percobaan 1 — Sistem Informasi Konsultasi Rumah Sakit  
**Direktori Kerja:** `R:\PBO-Java\Jobsheet04\RumahSakit\`  

---

## 📌 Ringkasan Arsitektur Kelas Percobaan 1
Percobaan 1 memodelkan alur konsultasi medis pasien di rumah sakit dengan 4 kelas:
1. `Pegawai.java` : Entitas dasar tenaga medis (dokter dan perawat) yang menyimpan `nip` dan `nama`.
2. `Konsultasi.java` : Memodelkan **Relasi Asosiasi** ke kelas `Pegawai` melalui atribut objek `dokter` dan `perawat`, serta tanggal konsultasi (`LocalDate`).
3. `Pasien.java` : Memodelkan **Relasi Komposisi/Agregasi** ke kelas `Konsultasi` dengan menyimpan kumpulan sesi konsultasi di dalam wadah dinamis `ArrayList<Konsultasi> riwayatKonsultasi`.
4. `RumahSakitDemo.java` : Kelas runner (`main`) untuk menginstansiasi dokter, perawat, pasien, serta menambahkan jadwal konsultasi dan mencetak rekaman medis ke terminal.

---

## 💻 1. Source Code `Pegawai.java`
**Lokasi Berkas:** `R:\PBO-Java\Jobsheet04\RumahSakit\Pegawai.java`

```java
public class Pegawai {
    private String nip;
    private String nama;

    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        return nama + " (" + nip + ")";
    }
}
```

---

## 💻 2. Source Code `Konsultasi.java`
**Lokasi Berkas:** `R:\PBO-Java\Jobsheet04\RumahSakit\Konsultasi.java`

```java
import java.time.LocalDate;

public class Konsultasi {
    private LocalDate tanggal;
    private Pegawai dokter;
    private Pegawai perawat;

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai getDokter() {
        return dokter;
    }

    public void setDokter(Pegawai dokter) {
        this.dokter = dokter;
    }

    public Pegawai getPerawat() {
        return perawat;
    }

    public void setPerawat(Pegawai perawat) {
        this.perawat = perawat;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Dokter: " + dokter.getInfo();
        info += ", Perawat: " + perawat.getInfo();
        info += "\n";

        return info;
    }
}
```

---

## 💻 3. Source Code `Pasien.java`
**Lokasi Berkas:** `R:\PBO-Java\Jobsheet04\RumahSakit\Pasien.java`

```java
import java.time.LocalDate;
import java.util.ArrayList;

public class Pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi> riwayatKonsultasi;

    public Pasien(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<Konsultasi>();
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat) {
        Konsultasi konsultasi = new Konsultasi();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }

    public String getInfo() {
        String info = "";
        info += "No Rekam Medis : " + this.noRekamMedis + "\n";
        info += "Nama           : " + this.nama + "\n";

        if (!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi :\n";

            for (Konsultasi konsultasi : riwayatKonsultasi) {
                info += konsultasi.getInfo();
            }
        }
        else {
            info += "Belum ada riwayat konsultasi";
        }

        info += "\n";

        return info;
    }
}
```

---

## 💻 4. Source Code `RumahSakitDemo.java` (Main Class)
**Lokasi Berkas:** `R:\PBO-Java\Jobsheet04\RumahSakit\RumahSakitDemo.java`

```java
import java.time.LocalDate;

public class RumahSakitDemo {
    public static void main(String[] args) {
        Pegawai ani = new Pegawai("1234", "dr. Ani");
        Pegawai bagus = new Pegawai("4567", "dr. Bagus");

        Pegawai desi = new Pegawai("1234", "Ns. Desi");
        Pegawai eka = new Pegawai("4567", "Ns. Eka");

        Pasien pasien1 = new Pasien("343298", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

        System.out.println(pasien1.getInfo());

        Pasien pasien2 = new Pasien("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}
```

---

## 🖥️ 5. Hasil Output Eksekusi Terminal
Hasil eksekusi program `java RumahSakitDemo` (JDK 24):

```text
No Rekam Medis : 343298
Nama           : Puspa Widya
Riwayat Konsultasi :
	Tanggal: 2021-08-11, Dokter: dr. Ani (1234), Perawat: Ns. Desi (1234)
	Tanggal: 2021-09-11, Dokter: dr. Bagus (4567), Perawat: Ns. Eka (4567)


No Rekam Medis : 997744
Nama           : Yenny Anggraeni
Belum ada riwayat konsultasi

```

---

## 🔗 Berkas Terkait Lainnya
- **Jawaban 7 Pertanyaan Analisis Percobaan 1:**  
  `C:\Users\Ridhoo\Downloads\Jawaban_Pertanyaan_Percobaan_1_PBO_JS4.md`
- **Laporan Lengkap Praktikum + Tugas Kafe:**  
  `C:\Users\Ridhoo\Downloads\Isian_Laporan_Jobsheet_04_PBO.md`
- **Workspace Java di VS Code:**  
  `R:\PBO-Java\Jobsheet04\RumahSakit\`

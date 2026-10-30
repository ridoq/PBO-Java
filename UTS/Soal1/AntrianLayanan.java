import java.util.ArrayList;

public class AntrianLayanan {
    private final ArrayList<Mahasiswa> antrianMenunggu;
    private int counterNomor;

    public AntrianLayanan() {
        this.antrianMenunggu = new ArrayList<>();
        this.counterNomor = 1;
    }

    public void ambilNomor(Mahasiswa mhs) {
        if (mhs == null) {
            System.out.println("Data mahasiswa tidak valid.");
            return;
        }

        if ("MENUNGGU".equals(mhs.getStatusAntrian())) {
            System.out.println("Mahasiswa " + mhs.getNama() + " sudah memiliki nomor antrian A-" + mhs.getNomorAntrian());
            return;
        }

        mhs.setNomorAntrian(counterNomor++);
        mhs.setStatusAntrian("MENUNGGU");
        antrianMenunggu.add(mhs);

        System.out.println("Ambil Antrian : Nomor A-" + mhs.getNomorAntrian() + " | " + mhs.getNama());
    }

    public void panggilAntrian() {
        if (antrianMenunggu.isEmpty()) {
            System.out.println("Panggilan Ditolak: Antrian kosong, tidak ada antrian untuk dipanggil.");
            return;
        }

        Mahasiswa dipanggil = antrianMenunggu.remove(0);
        dipanggil.setStatusAntrian("SELESAI");

        System.out.println("Memanggil     : Nomor A-" + dipanggil.getNomorAntrian() + " | " + dipanggil.getNama());
    }

    public void tampilkanSisaAntrian() {
        System.out.println("\n--- Sisa Antrian (" + antrianMenunggu.size() + " orang) ---");
        if (antrianMenunggu.isEmpty()) {
            System.out.println("Tidak ada antrian yang menunggu.");
        } else {
            for (int i = 0; i < antrianMenunggu.size(); i++) {
                Mahasiswa m = antrianMenunggu.get(i);
                System.out.println((i + 1) + ". Nomor A-" + m.getNomorAntrian() + " - " + m.getNama());
            }
        }
        System.out.println();
    }
}

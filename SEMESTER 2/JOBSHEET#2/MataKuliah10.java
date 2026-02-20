public class MataKuliah10 {
    String KodeMK;
    String NamaMK;
    int SKS;
    int jumlahjam;

    void tampilInformasi() {
        System.out.println("Kode MK : " + KodeMK);
        System.out.println("Nama Matkul : " + NamaMK);
        System.out.println("SKS : " + SKS);
        System.out.println("Jumlah Jam : " + jumlahjam);
    }

    void ubahSKS(int sksBaru) {
        SKS = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahjam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahjam > jam) {
            jumlahjam -= jam;
            System.out.println("Jumlah Jam berhasil dikurangi. Jam saat ini: " + jumlahjam);
        } else {
            System.out.println("Jumlah Jam tidak dapat dikurangi. Jam saat ini: " + jumlahjam);
        }
    }

    public MataKuliah10() {

    }

    public MataKuliah10(String kdMK, String nmMK, int sks, int jmlhjam) {
        KodeMK = kdMK;
        NamaMK = nmMK;
        this.SKS = sks;
        jumlahjam = jmlhjam;
    }
}


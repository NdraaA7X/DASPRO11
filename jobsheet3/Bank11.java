import java.util.Scanner;

public class Bank11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int jml_tabungan_wal, lama_menabung;
        double prosentase_bunga =0.02 , bunga, jml_tabungan_akhir;

        System.out.println("masukkan jumlah tabungan awal anda");
        jml_tabungan_wal = sc.nextInt ();
        System.out.println("masukkan lama menabung anda");
        lama_menabung = sc.nextInt ();

        bunga = lama_menabung*prosentase_bunga*jml_tabungan_wal;
        jml_tabungan_akhir=bunga+jml_tabungan_wal;

        System.out.println("Bunga adalah " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " +jml_tabungan_akhir);

        sc.close();
    }
}
import java.util.Scanner;

public class StudiKasus1_Modifikasi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tunjangan_anak = 150000, jumlah_anak, gaji_pokok = 3000000;
        double potongan_dana_karyawan = 0.05, gaji_bersih, potongan_gaji, total_tunjangan, gaji_pokok_diterima;

        System.out.println("Gaji Pokok Yang Dimiliki Bu Jesi Adalah ");
        gaji_pokok = sc.nextInt();
        System.out.println("Tunjangan Per Anak ");
        tunjangan_anak = sc.nextInt();
        System.out.println("Potongan Dana Pensiun " + potongan_dana_karyawan);
        System.out.println("Anak Yang Dimiliki Bu Jesi");
        jumlah_anak = sc.nextInt();

       total_tunjangan = tunjangan_anak * jumlah_anak;
       potongan_gaji = gaji_pokok * potongan_dana_karyawan;
       gaji_pokok_diterima = gaji_pokok - potongan_gaji;
       gaji_bersih = gaji_pokok_diterima + total_tunjangan;

        System.out.println("Gaji Bersih Bu Jesi Adalah " + gaji_bersih);
    }
}
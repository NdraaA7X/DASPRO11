import java.util.Scanner;

public class GajiKaryawan11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajipokok;
        double bonus, totalGaji;
        double tunjTransp = 600000;
        double tunjMkn = 400000;

        System.out.println("Massukan Gaji Pokok : ");
        gajipokok = sc.nextInt();
        bonus = 0.05*gajipokok;
        totalGaji = gajipokok + tunjTransp + tunjMkn + bonus - (0.1*gajipokok);

        System.out.println("Bonus Bulanan Anda Adalah Rp." + bonus);
        System.out.println("Gaji Yang Diterima Adalah Rp." + totalGaji);
        int totalgajibulat = (int) totalGaji;
        System.out.println("Gaji Bulan Yang Diterima Adalah Rp." + totalgajibulat);
    }
}
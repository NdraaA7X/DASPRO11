import java.util.Scanner;

public class Percobaan3 {
    static double hitungLaba (double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal: ");
        saldoAwal = sc.nextDouble();
        System.out.print("Lamanya Investasi (Tahun): ");
        tahun = sc.nextInt();

        System.out.print("Jumlah Saldo Setelah " + tahun + " tahun : ");
        System.out.printf("%.2f", hitungLaba(saldoAwal, tahun));

        sc.close();
    }
}

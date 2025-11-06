import java.util.Scanner;

public class Tugas3KopiSenja11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int item;
        int totalSemuaPelanggan = 0, totalSemuaItem = 0;

        System.out.print(" Masukan Jumlah Cbang Kafe : ");
        int jumlahcabang = sc.nextInt();

        System.out.println("\n==== Input Penjualan Per Cabang ====");

        for (int cabang = 1; cabang <= jumlahcabang; cabang++) {
            System.out.println("\n---- Cabang " + cabang + " ----");
            System.out.print("Jumlah Pelanggan : ");
            int jumlahpelanggan = sc.nextInt();

            int totalitemcabang = 0;
            for (int pelanggan = 1; pelanggan <= jumlahpelanggan; pelanggan++) {
                System.out.print("- pelanggan " + pelanggan + " membeli berapa item ? ");
                item = sc.nextInt();  
                totalitemcabang += item;
            }

            System.out.println(" Cabang " + cabang + " : ");
            System.out.println("- Pelanggan : " + jumlahpelanggan + " orang ");
            System.out.println("- Item Terjual : " + totalitemcabang + " item ");

            totalSemuaPelanggan += jumlahpelanggan;
            totalSemuaItem += totalitemcabang;
        }
        System.out.println("\nTotal Seluruh Cabang : ");
        System.out.println("- pelanggan : " + totalSemuaPelanggan + " orang ");
        System.out.println("- Item Terjual : " + totalSemuaItem + " item ");

        sc.close();
    }
}

import java.util.Scanner;

public class RekapPenjualanCafe11 {
    static String[] menu;
    static int[][] penjualan = new int[5][7];

    public static void inputPenjualan() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== INPUT DATA PENJUALAN ===");
        System.out.print("Masukan Jumlah Menu : ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukan Jumlah Hari Penjualan : ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];

        System.out.println("\n====== INPUT NAMA MENU ======");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama Menu Ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        System.out.println("\n====== INPUT DATA PENJUALAN ======");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Input Penjualan Menu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(" Hari Ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

     public static void tampilData() {
        System.out.println("\n======================= TABEL PENJUALAN 7 HARI =======================");

        System.out.printf("%-20s", "Menu");
        for (int h = 0; h < penjualan[0].length; h++) {
            System.out.printf(" Hari %d ", h + 1);
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < penjualan.length; i++) {
            System.out.printf("%-20s", menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%6d  ", penjualan[i][j]);
            }
            System.out.println();
        }
        System.out.println("======================================================================");
    }

     public static void menuTerlaris() {
        int maxTotal = -1;
        int indexMenu = 0;

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                indexMenu = i;
            }
        }

        System.out.println("\n===== MENU DENGAN PENJUALAN TERTINGGI =====");
        System.out.println("Menu " + menu[indexMenu]);
        System.out.println("Total Penjualan " + maxTotal);
    }

     public static void rataRataMenu() {
        System.out.println("\n===== RATA-RATA PENJUALAN TIAP MENU =====");

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;

            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            double rata = (double) total / penjualan[i].length;
            System.out.printf("Menu %-20s : %.2f\n", menu[i], rata);
        }
    }

      public static void main(String[] args) {
        inputPenjualan();
        tampilData();
        menuTerlaris();
        rataRataMenu();
    }
}

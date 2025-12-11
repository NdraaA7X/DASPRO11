import java.util.Scanner;

public class casemathod11 {

    static String[][] data = new String[100][3];

    static double[] ipk = new double[100];
    static int[] penghasilan = new int[100];

    static int jumlah = 0;
    static Scanner in = new Scanner(System.in);

    static void tampilMenu() {
        System.out.println("\n=== MENU BEASISWA AKADEMIK ===");
        System.out.println("1. Tambah Data Pendaftar Beasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Cari Berdasarkan Jenis Beasiswa");
        System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
        System.out.println("5. Keluar");
    }

    static void tambahData() {

        System.out.print("Nama: ");
        data[jumlah][0] = in.nextLine();

        System.out.print("NIM: ");
        data[jumlah][1] = in.nextLine();

        System.out.print("IPK: ");
        ipk[jumlah] = in.nextDouble();
        in.nextLine();

        String jenisBeasiswa;
        while (true) {
            System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
            jenisBeasiswa = in.nextLine();
            if (jenisBeasiswa.equalsIgnoreCase("Reguler") ||
                    jenisBeasiswa.equalsIgnoreCase("Unggulan") ||
                    jenisBeasiswa.equalsIgnoreCase("Riset")) {
                break;
            }
            System.out.println("Jenis tidak valid!");
        }
        data[jumlah][2] = jenisBeasiswa;

        int penghasilanOrtu;
        while (true) {
            System.out.print("Penghasilan Orang Tua (maks 2000000): ");
            penghasilanOrtu = in.nextInt();
            in.nextLine();

            if (penghasilanOrtu <= 2000000)
                break;
            System.out.println("Pendaftaran Dibatalkan Karena Penghasilan Melebihi Batas Maksimal.");
        }
        penghasilan[jumlah] = penghasilanOrtu;

        jumlah++;
        System.out.println("Pendaftar Berhasil Disimpan. Total Pendaftar: " + jumlah);
    }

    static void tampilkanData() {
        System.out.println("\n=== DATA PENDAFTAR ===");
        System.out.printf("%-15s %-10s %-5s %-12s %-15s\n",
                "Nama", "NIM", "IPK", "Jenis", "Penghasilan");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-15s %-10s %-5.2f %-12s Rp%-10d\n",
                    data[i][0], data[i][1], ipk[i], data[i][2], penghasilan[i]);
        }
    }

    static void cariByJenis() {

        System.out.print("Cari jenis (Reguler/Unggulan/Riset): ");
        String key = in.nextLine();

        boolean ada = false;

        System.out.printf("\n%-15s %-10s %-5s %-12s %-10s\n",
                "Nama", "NIM", "IPK", "Jenis", "Penghasilan");

        for (int i = 0; i < jumlah; i++) {
            if (data[i][2].equalsIgnoreCase(key)) {
                System.out.printf("%-15s %-10s %-5.2f %-12s Rp%-10d\n",
                        data[i][0], data[i][1], ipk[i], data[i][2], penghasilan[i]);
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada Pendaftar.");
        }
    }

    static void hitungRataIPK() {
        System.out.println("\n=== RATA-RATA IPK ===");
        System.out.println("Reguler   : rata-rata IPK = " + rataIPK("Reguler"));
        System.out.println("Unggulan  : rata-rata IPK = " + rataIPK("Unggulan"));
        System.out.println("Riset     : rata-rata IPK = "  + rataIPK("Riset"));
    }

    static String rataIPK(String jenis) {
        double total = 0;
        int count = 0;

        for (int i = 0; i < jumlah; i++) {
            if (data[i][2].equalsIgnoreCase(jenis)) {
                total += ipk[i];
                count++;
            }
        }

        if (count == 0) {
            return "Tidak ada pendaftar";
        } else {
            double rata = total / count;
            return String.format("%.2f", rata);
        }
    }

    public static void main(String[] args) {
        int menu;

        do {
            tampilMenu();
            System.out.print("Pilih Menu(1-5): ");
            menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1:
                    tambahData();
                    break;

                case 2:
                    tampilkanData();
                    break;

                case 3:
                    cariByJenis();
                    break;

                case 4:
                    hitungRataIPK();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
                    break;
            }

        } while (menu != 5);
    }
}

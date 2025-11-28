import java.util.Scanner;

public class Kafe11 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang," + namaPelanggan + " ! ");

    if (isMember) {
        System.out.println("Anda Adalah Member, Dapatkan Diskon 10% Untuk Setiap Pembelian!");
    }

    if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode Promo Diterima! Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode Promo Diterima! Anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo invalid !!");
        }


        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp. 15,000");
        System.out.println("2. Cappuccino - Rp. 20,000");
        System.out.println("3. Latte - Rp. 22,000");
        System.out.println("4. Teh Tarik - Rp. 12,000");
        System.out.println("5. Roti Bakar - Rp. 10,000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda Inginkan.");
        System.out.println("Masukkan 0 Untuk mengakhiri Pesanan++");
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Silakan Memlilih Kode Promo -DISKON30- Atau -DISKON50");
        System.out.print("Masukan KODE PROMO: ");
        String kodePromo = sc.nextLine();

        Menu("Hendra", true, kodePromo);

        int totalKeseluruhan = 0;
        while (true) {
        System.out.print("\nMasukan nomor Menu yang Ingin Anda Pesan: ");
        int pilihanMenu = sc.nextInt();

        if(pilihanMenu == 0) {
            break;
    }

        System.out.print("Masukkan Jumlah Item Yang Inggin Dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga11(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total Harga untuk Pesanan Anda Rp." + totalHarga);

        totalKeseluruhan += totalHarga;

        }

        System.out.println("\n===== TOTAL KESELURUHAN PESANAN =====");
        System.out.println("Total Harga: Rp." + totalKeseluruhan);

        sc.close();
    }

    public static int hitungTotalHarga11 (int pilihanMenu, int banyakItem, String kodePromo) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaAwal = hargaItems[pilihanMenu - 1] * banyakItem;
        int totalHarga = hargaAwal;

       
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            int diskon = hargaAwal * 50 / 100;
            System.out.println("Anda mendapatkan diskon 50%");
            totalHarga = hargaAwal - diskon;

        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            int diskon = hargaAwal * 30 / 100;
            System.out.println("Anda mendapatkan diskon 30%");
            totalHarga = hargaAwal - diskon;

        } else {
            System.out.println("Kode promo invalid. Tidak ada diskon.");
        }

        return totalHarga;
      }
}
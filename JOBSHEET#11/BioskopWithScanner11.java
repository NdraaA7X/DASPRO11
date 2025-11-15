import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int menu;

        do {
            System.out.println("\n==== MENU BIOSKOP ====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {

                System.out.print("Masukkan nama: ");
                String nama = sc.nextLine();

                int baris, kolom;

                while (true) {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("WARNING !! Nomor baris atau kolom tidak tersedia! Masukkan ulang.");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("WARNING !! Kursi sudah terisi oleh: " + penonton[baris - 1][kolom - 1]);
                        System.out.println("Silakan masukkan baris & kolom lain!");
                    } else {
                        break;
                    }
                }

                penonton[baris - 1][kolom - 1] = nama;
                System.out.println("Data penonton berhasil disimpan!");

            } else if (menu == 2) {

                System.out.println("\n=== DAFTAR PENONTON ===");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris " + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("[***] ");
                        } else {
                            System.out.print("[" + penonton[i][j] + "] ");
                        }
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Terima kasih, program selesai!");
            } else {
                System.out.println("Menu tidak valid!");
            }

        } while (menu != 3);

        sc.close();
    }
}
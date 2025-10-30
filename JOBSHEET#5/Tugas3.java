package jobsheet5;

import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis pengguna (Dosen/Mahasiswa): ");
        String jenisPengguna = sc.nextLine();

        if (jenisPengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses Wifi Diberikan Kepada Dosen");
        } else 
            if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            int jumlahSKS = sc.nextInt();

            if (jumlahSKS >= 12) {
                System.out.println("Akses Diberikan Kepada Mahasiswa");
            } else {
                System.out.println("Akses Ditolak Jumlah SKS Kurang Dari 12");
            }
        } else {
            System.out.println("Akses Ditolak");
        }

        sc.close();
    }
}

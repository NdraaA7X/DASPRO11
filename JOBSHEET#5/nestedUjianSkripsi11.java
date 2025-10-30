package jobsheet5;

import java.util.Scanner;
public class nestedUjianSkripsi11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Apakah Mahasiswa sudah Bebas Kompen? (Ya/Tidak): ");
        String BebasKompen = sc.nextLine().trim();
        System.out.println("Masukan jumlah log bimbingan pembimbing 1 : ");
        int BimbinganP1 = sc.nextInt();
        System.out.println("Masukan jumlah log bimbingan pembimbing 2 : ");
        int BimbinganP2 = sc.nextInt();

        String Pesan;

        if (BebasKompen.equalsIgnoreCase("Ya")) {
            if (BimbinganP1 >= 8 && BimbinganP2 >=4) {
                Pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            }else 
            if (BimbinganP1 < 8 && BimbinganP2 <=4) {
                Pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            }else
            if (BimbinganP1 < 8) {
                Pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali";
            }else { 
                Pesan = "Gagal! Log bimbingan P2 kurang dari 4 kali";
            }
    } else {
            Pesan = "Gagal! Mahasiswa masih memiliki tanggungan Kompen";
        }
        System.out.println(Pesan);
        sc.close();
    }
}
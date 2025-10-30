package jobsheet5;

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("KRS siap dicetak. Silakan ambil dan tanda tangani oleh Dosen Pembina Akademik.");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
        }

        String pesan = (uktLunas) 
            ? "KRS siap dicetak. Silakan ambil dan tanda tangani oleh Dosen Pembina Akademik." 
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";
        System.out.println(pesan);

        sc.close();
    }
}
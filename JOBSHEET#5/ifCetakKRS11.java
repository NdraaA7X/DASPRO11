package jobsheet5;
import java.util.Scanner;
public class ifCetakKRS11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        Boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahakan cetak KRS dan minta tanga tangan DPA");
        } else {
            System.out.println("Pembayaran UKT Belum Terverifikasi");
            System.out.println("Silahkan lunasi UKT terlebih dahulu");
        }
        sc.close();
    }
    
}

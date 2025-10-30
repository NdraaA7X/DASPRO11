import java.util.Scanner;

public class Tugas1_Jobsheet3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Harga Motor :");
        int x = sc.nextInt();
        System.out.println("Masukan Uang Muka :");
        double y = sc.nextDouble();
        System.out.println("Masukan Lama Cicilan :");
        int z = sc.nextInt();

        double sisaharga = x - y;
        double totpinjaman = 0.01 + sisaharga;
        double cicilanperbulan = totpinjaman/z;
        System.out.println("Total Cicilan Perbulan Yang Harus Di Bayar Rp. " + cicilanperbulan);
        
    }
}
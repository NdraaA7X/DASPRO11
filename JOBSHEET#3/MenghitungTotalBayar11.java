import java.util.Scanner;

public class MenghitungTotalBayar11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        System.out.println("Masukkan Harga : ");
        harga=sc.nextInt();
        potongan = diskon*harga;
        jml_bayar = harga - potongan;
        System.out.println("Total Harga Yang Akan Dibayar Bu Lani Adalah : " + jml_bayar);

        sc.close();
    }
}
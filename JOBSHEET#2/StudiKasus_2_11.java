import java.util.Scanner;

public class StudiKasus_2_11 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int lebar_tanah = 50, panjang_tanah = 100, jumlah_kolam = 2, diameter = 2, sisi = 2;
    double luas_kolam_persegi, phi = 3.14,luas_kolam_lingkaran, luas_tanah, sisa_tanah;
   
    // Tanah Yang Dimiliki Pak Jaka

    System.out.println("Pak Jaka Mempunyai Tanah Dengan Panjang 100m dan Lebar 50m ");
    luas_tanah = panjang_tanah * lebar_tanah;
    System.out.println("Luas Tanah Pak Jaka Ialah " + luas_tanah);

    // Luas Kolam Pak Jaka

    System.out.println("Pak Jaka Berencana Membuat 2 Kolam Ikan Yang Berbentuk Lingkaran Dan Persegi ");
    luas_kolam_persegi = sisi * sisi;
    System.out.println("Luas Kolam Persegi Yang Dimiliki Pak Jaka Adalah " + luas_kolam_persegi);
    luas_kolam_lingkaran = phi * diameter / 2 * diameter / 2;
    System.out.println("Luas Kolam Lingkaran Yang Dimiliki Pak Jaka Adalah " + luas_kolam_lingkaran);

    // Sisa Tanak Pak Jaka

    sisa_tanah = luas_tanah - luas_kolam_lingkaran - luas_kolam_persegi;
    System.out.println("Sisa Tanah Yang Akan Pak Jaka Tanami Rumput Adalah " + sisa_tanah);

    sc.close();
    }
}
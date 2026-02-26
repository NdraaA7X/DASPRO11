import java.util.Scanner;

public class StudiKasus2Modifikasi_11 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double lebar_tanah = 50, panjang_tanah= 100, diameter = 2, sisi = 2;
    double luas_kolam_persegi, phi = 3.14,luas_kolam_lingkaran, luas_tanah, sisa_tanah;

    System.out.println("Panjang Tanah : ");
    panjang_tanah = sc.nextInt();
    System.out.println("Lebar Tanah : ");
    lebar_tanah = sc.nextInt();
    luas_tanah = panjang_tanah * lebar_tanah;
    System.out.println("Luas Tanah : " + luas_tanah);
    System.out.println("Diameter Kolam Lingkaran : ");
    diameter = sc.nextInt();
    System.out.println("Panjang sisi Kolam Persegi : ");
    sisi = sc.nextInt();
    System.out.println("Kolam Lingkaran ? ");
    double jumlah_kolam = sc.nextInt();
    System.out.println("Kolam Persegi ?");
    jumlah_kolam = sc.nextInt();

    luas_kolam_lingkaran = phi * diameter / 2 * diameter / 2;
    System.out.println("Luas Kolam Lingkaran " + luas_kolam_lingkaran);
    luas_kolam_persegi = sisi * sisi;
    System.out.println("Luas Kolam Persegi : " + luas_kolam_persegi);
    sisa_tanah = luas_tanah - luas_kolam_lingkaran - luas_kolam_persegi;
    System.out.println("Sisa Tanah Yang Tersedia : " + sisa_tanah);

    sc.close();
    }
}
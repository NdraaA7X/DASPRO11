import java.util.Scanner;

public class HitungBalok11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, Vol;

        System.out.println("Masukkan Panjang");
        p = input.nextInt();

        System.out.println("Masukan Lebar");
        l = input.nextInt();

        System.out.println("Masukan Tinggi");
        t = input.nextInt();

        L = p * l;
        System.out.println("Luas Persegi Panjang Adalah " + L);
        Vol = p * l * t;
        System.out.println("Volume Balok Adalah " + Vol);

        input.close();
    }

    static int hitungLuas(int pjg, int lb){
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b){
        int volume  = hitungLuas(a, b) * tinggi;
        return volume;
    }
}

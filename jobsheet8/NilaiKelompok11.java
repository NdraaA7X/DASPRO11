import java.util.Scanner;

public class NilaiKelompok11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, j, nilai, kelompoktertinggi = 0;
        float totalNilai, rataNilai, ratatertinggi = 0;

        totalNilai = 0;
        for (j = 1; j <= 5; j++) {
            System.out.print("Nilai Dari Kelompok Penilai " + j + " : ");
            nilai = sc.nextInt();
            totalNilai += nilai;
        }

        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai Dari Kelompok Penilai " + j + " : ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-Rata Nilai Kelompok " + i + " : " + rataNilai);

            if (rataNilai > ratatertinggi) {
                ratatertinggi = rataNilai;
                kelompoktertinggi = i;

            }
            i++;
        }
        System.out.println("Kelompok dengan Nilai Tertinggi adalah Kelompok " + kelompoktertinggi + " dengan Nilai " + ratatertinggi);
        sc.close();    
    }
}

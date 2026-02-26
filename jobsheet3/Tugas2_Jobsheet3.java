import java.util.Scanner;

public class Tugas2_Jobsheet3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Jauhnya Perjalanan KM : ");
        int jaraktempuh = sc.nextInt();

        int bensin = jaraktempuh / 2 ;
        int biaya = bensin * 10000;

        System.out.println("Biaya Bensin Yang Diperlukan Dalam Perjalanan Tersebut Sebesar Rp. " + biaya);

        sc.close();
    }
}
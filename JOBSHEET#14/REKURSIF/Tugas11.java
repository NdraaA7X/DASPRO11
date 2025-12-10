import java.util.Scanner;

public class Tugas11 {
    static int fungsiRekursif(int[] angka, int n) {
        if (n == 0) {
            return (0); 
        } else if(n == 1) {
            return (angka[0]);
        } else {
            return(angka[n - 1] + fungsiRekursif(angka, n - 1));
        }
    }


    static int fungsiIteratif(int[] angka, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += angka[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();
        int[] angka = new int[n];

        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[n - i] = sc.nextInt();
        }

        int hasilRekursif = fungsiRekursif(angka, n);
        int hasilIteratif = fungsiIteratif(angka, n);

        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: ");
        System.out.println("Hasil dari " + n + " angka yang dimasukkan (Rekursif): " + hasilRekursif);
        System.out.println("Hasil dari " + n + " angka yang dimasukkan (Iteratif): " + hasilIteratif);

        sc.close();
    }
}

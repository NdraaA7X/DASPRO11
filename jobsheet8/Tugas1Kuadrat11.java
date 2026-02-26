import java.util.Scanner;

public class Tugas1Kuadrat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, kuadrat = 0;

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        for (j = 1; j <= n; j++) {
            int jumlah = 0;
            System.out.print("n = " + j + " --> jumlah kuadrat = ");

            for (i = 1; i <= j; i++) {
                kuadrat = i * i;
                jumlah += kuadrat;

                System.out.print(kuadrat);
                if (i < j) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah);
        }
        sc.close();
    }
} 


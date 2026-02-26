import java.util.Scanner;

public class LatihanC {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int dataResponden[][] = new int[10][6];

       System.out.println("\n==== DATA SURVEI ====");

       for (int i = 0; i < dataResponden.length; i++) {
              System.out.println("Responden ke-" + (i + 1));
              double rata2 = 0;

            for (int j = 0; j < dataResponden[j].length; j++) {
                System.out.print("Nila Survei Ke-" + (j + 1) + ": ");
                dataResponden[i][j] = sc.nextInt();
                rata2 += dataResponden[i][j];
            }

            System.out.println("Rata Rata Data Setiap Responden " + rata2 / 6);
            System.out.println();
        }

        System.out.println("\n==== RATA RATA SETIAP PERTANYAAN ====");

        for (int i = 0; i < dataResponden[0].length; i++) {
            double total = 0;

            for (int j = 0; j < dataResponden.length; j++) {
                total += dataResponden[j][i];
            }

            double rata2Pertanyaan = total / dataResponden.length;
            System.out.printf("Pertanyaan Ke-%d: %.2fn",i + 1, rata2Pertanyaan);
        }
            sc.close();
    }
}

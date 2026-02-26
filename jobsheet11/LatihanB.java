import java.util.Scanner;

public class LatihanB {
    
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int dataResponden[][] = new int[10][6];

       System.out.println("\n==== DARTA SURVEI ====");

       for (int i = 0; i < dataResponden.length; i++) {
              System.out.println("Responden ke-" + (i + 1));
              double rata2 = 0;

            for (int j = 0; j < dataResponden[j].length; j++) {
                System.out.print("Nila Survei Ke-" + (j + 1) + ": ");
                dataResponden[i][j] = sc.nextInt();
                rata2 += dataResponden[i][j];
            }

            System.out.println("Rata Rata Data Setiap Responden " + rata2 / 6);
        }
              sc.close();
    }
}

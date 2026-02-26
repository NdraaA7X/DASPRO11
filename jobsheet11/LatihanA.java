import java.util.Scanner;

public class LatihanA {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int dataResponden[][] = new int[10][6];

       System.out.println("\n==== DARTA SURVEI ====");

       for (int i = 0; i < dataResponden.length; i++) {
              System.out.println("Responden ke-" + (i + 1));

            for (int j = 0; j < dataResponden[j].length; j++) {
                System.out.print("Nila Survei Ke-" + (j + 1) + ": ");
                dataResponden[i][j] = sc.nextInt();
            }

        }
              sc.close();
    }
}

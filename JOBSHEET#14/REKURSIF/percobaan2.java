import java.util.Scanner;

public class percobaan2 {
    static int hitungPangkat (int x, int y) {
        if (y == 0) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print(x +"x");
            return x * hitungPangkat(x, y - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Bilangan, Pangkat;

        System.out.print("Bilangan Yang Di Hitung : ");
        Bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        Pangkat = sc.nextInt();

        int hasil = hitungPangkat(Bilangan, Pangkat);
        System.out.println(" = " + hasil);
        
        sc.close();
    }
}


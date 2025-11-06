import java.util.Scanner;

public class ArrayNilai11 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan Nilai Akhir Ke-" + i +" : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        System.out.println();

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] >= 70) {
            System.out.println("Mahasiswa ke-"+ i +" lulus! ");
            }  else {
                System.out.println("Mahasiswa ke- " + (i + 1) + " tidak lulus");
            } 
        }
        sc.close();
     }
    }


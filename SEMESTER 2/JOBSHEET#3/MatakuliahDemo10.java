import java.util.Scanner;
public class MatakuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah10[] arrayOfMatakuliah10 = new Matakuliah10[3];
        String kode, nama, dummy;
        int sks, jumlahjam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode      : ");
            kode = sc.nextLine();
            System.out.print("Nama      : ");
            nama = sc.nextLine();
            System.out.print("SKS       : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = sc.nextLine();
            jumlahjam = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfMatakuliah10[i] = new Matakuliah10(kode, nama, sks, jumlahjam);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode      : " + arrayOfMatakuliah10[i].kode);
            System.out.println("Nama      : " + arrayOfMatakuliah10[i].nama);
            System.out.println("SKS       : " + arrayOfMatakuliah10[i].sks);
            System.out.println("Jumlah Jam: " + arrayOfMatakuliah10[i].Jumlahjam);
            System.out.println("-----------------------------");
        }

    }
}

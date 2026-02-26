import java.util.Scanner;

public class DosenDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Dosen10[] arrayOfDosen = new Dosen10[jumlah];
        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true=Pria / false=Wanita): ");
            dummy = sc.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen10(kode, nama, jenisKelamin, usia);
        }

        int no = 1;
        for (Dosen10 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no);
            dosen.cetakInfo();
            no++;
        }
        sc.close();
    }
}


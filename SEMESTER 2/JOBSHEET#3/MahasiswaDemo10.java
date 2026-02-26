import java.util.Scanner;
public class MahasiswaDemo10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa10[] arrayOFMahasiswa10 = new Mahasiswa10[3];
        String dummy;

        for (int i=0; i < 3; i++) {
            arrayOFMahasiswa10[i] = new Mahasiswa10();

            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            arrayOFMahasiswa10[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOFMahasiswa10[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOFMahasiswa10[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOFMahasiswa10[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            arrayOFMahasiswa10[i].cetakInfo();
        }
        sc.close();
    }
}


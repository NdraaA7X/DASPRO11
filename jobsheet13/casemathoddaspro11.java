import java.util.Scanner;

public class casemathoddaspro11 {
    static Scanner sc = new Scanner(System.in);

    static String[][] dataMagang = new String[100][6];
    static int jumlahData = 0;

    static void tambahData () {
        
        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("NIM: ");
        String nim = sc.nextLine(); 

        System.out.print("Program Studi: ");
        String Prodi = sc.nextLine();

        System.out.print("Perusahaan Tujuan Magang: ");
        String Perusahaan = sc.nextLine();

        String Semester = "";

        while (true) {
            System.out.print("Semester Pengambilan Magang (6 atau 7): ");
            Semester = sc.nextLine();
            if (Semester.equals("6") || Semester.equals("7")) break;
            System.out.println("Semester harus 6 atau 7.");
        }

        String Status = "";
        while (true) {
            System.out.print("Status Magang (Diterima/Menunggu/Ditolak): ");
            Status = sc.nextLine();

            if (Status.equalsIgnoreCase("Diterima") ||
                Status.equalsIgnoreCase("Menunggu") ||
                Status.equalsIgnoreCase("Ditolak"))
                break;
                
            System.out.println("Status tidak valid!");
        }

            dataMagang[jumlahData][0] = nama;
            dataMagang[jumlahData][1] = nim;
            dataMagang[jumlahData][2] = Prodi;
            dataMagang[jumlahData][3] = Perusahaan;
            dataMagang[jumlahData][4] = Semester;
            dataMagang[jumlahData][5] = Status;

            jumlahData++;
            System.out.println("Data pendaftaran magang berhasil ditambahkan. Total pendaftar: " + jumlahData);
        }

        static void tampilData() {

            if (jumlahData == 0) {
                System.out.println("Belum Ada Pendaftar.");
                return;
            }

            System.out.printf("%-4s %-15s %-12s %-20s %-15s %-10s %-10s\n", "No", "Nama", "NIM", "Prodi", "Perusahaan", "Semester", "Status");

            for (int i = 0; i < jumlahData; i++) {
                System.out.printf("%-4s %-15s %-12s %-20s %-15s %-10s %-10s\n", 
                (i + 1),
                dataMagang[i][0],
                dataMagang[i][1],
                dataMagang[i][2],
                dataMagang[i][3],
                dataMagang[i][4],
                dataMagang[i][5]
            );
        }
    }

    static void cariprodi() {

        System.out.print("Masukan Program Studi: ");
        String cari = sc.nextLine();
        
        boolean found = false;

        System.out.printf("%-4s %-15s %-12s %-20s %-15s %-10s %-10s\n", "No", "Nama", "NIM", "Prodi", "Perusahaan", "Semester", "Status");

        for (int i = 0; i < jumlahData; i++) {
            if (dataMagang[i][2].equalsIgnoreCase(cari)) {
                found = true;

                System.out.printf("%-4s %-15s %-12s %-20s %-15s %-10s %-10s\n",
                (i + 1),
                dataMagang[i][0],
                dataMagang[i][1],
                dataMagang[i][2],
                dataMagang[i][3],
                dataMagang[i][4],
                dataMagang[i][5]
            );
        }
    }
    if (!found) {
        System.out.println("Tidak ditemukan pendaftar.");
    }
}

    static void hitungStatus() {

        int diterima = 0, menuggu = 0, ditolak = 0;

        for (int i = 0; i < jumlahData; i++) {
            String s = dataMagang[i][5];

            if (s.equalsIgnoreCase("Diterima")) diterima++;
            else if (s.equalsIgnoreCase("Menunggu"))menuggu++;
            else if (s.equalsIgnoreCase("Ditolak")) ditolak++;
        }

        System.out.println("Diterima : " + diterima);
        System.out.println("Menunggu : " + menuggu);
        System.out.println("Ditolak : " + ditolak);
        System.out.println("Total Pendaftar : " + jumlahData);
    }


    public static void main(String[] args) {
        int pilih;

        do { 
        System.out.println("=== Sistem Pendaftaran Magang Mahasiswa ===");
        System.out.println("1. Tambah Data Magang");
        System.out.println("2. Tampilkan Semua Pendaftar Magang");
        System.out.println("3. Cari Pendaftar Berdasarkan Program Studi");
        System.out.println("4. Hitung Jumlah Pendaftar Untuk Setiap Status");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu(1 - 5): ");

        pilih = sc.nextInt();
        sc.nextLine();

        switch (pilih) {
            case 1: tambahData();
            break;
            case 2: tampilData();
            break;
            case 3: cariprodi();
            break;
            case 4:
            if (jumlahData == 0) {
                System.out.println("Belum Ada Pendaftar.");
            } else {
                hitungStatus();
            }
            break;
            case 5: System.out.println("Program Selesai.");
            break;
            default:
                System.out.println("Belum Ada Pendaftar.");
           }
        } while (pilih !=5); {
            sc.close();
        }
    }
}

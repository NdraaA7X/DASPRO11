public class MahasiswaDemo10 {
    public static void main(String[] args) {
        Mahasiswa10[] arrayOFMahasiswa10 = new Mahasiswa10[3];
        arrayOFMahasiswa10[0] = new Mahasiswa10();
        arrayOFMahasiswa10[0].nim = "254107020217";
        arrayOFMahasiswa10[0].nama = "ABRAR RAYHAN MUHAMMAD";
        arrayOFMahasiswa10[0].kelas = "TI-1D";
        arrayOFMahasiswa10[0].ipk = (float)3.85;

        arrayOFMahasiswa10[1] = new Mahasiswa10();
        arrayOFMahasiswa10[1].nim = "254107020113";
        arrayOFMahasiswa10[1].nama = "FARHAN DEVANDRASAKTI ABDULLAH";
        arrayOFMahasiswa10[1].kelas = "TI-1D";
        arrayOFMahasiswa10[1].ipk = (float)3.75;

        arrayOFMahasiswa10[0].nim = "254107020134";
        arrayOFMahasiswa10[2] = new Mahasiswa10();
        arrayOFMahasiswa10[2].nim = "254107020134";
        arrayOFMahasiswa10[2].nama = "LUCKY AKBAR FEBRIANO";
        arrayOFMahasiswa10[2].kelas = "TI-1D";
        arrayOFMahasiswa10[2].ipk = (float)3.78;

        System.out.println("NIM     : " + arrayOFMahasiswa10[0].nim);
        System.out.println("Nama    : " + arrayOFMahasiswa10[0].nama);
        System.out.println("Kelas   : " + arrayOFMahasiswa10[0].kelas);
        System.out.println("IPK     : " + arrayOFMahasiswa10[0].ipk);
        System.out.println("---------------------------------------");
        System.out.println("NIM     : " + arrayOFMahasiswa10[1].nim);
        System.out.println("Nama    : " + arrayOFMahasiswa10[1].nama);
        System.out.println("Kelas   : " + arrayOFMahasiswa10[1].kelas);
        System.out.println("IPK     : " + arrayOFMahasiswa10[1].ipk);
        System.out.println("---------------------------------------");
        System.out.println("NIM     : " + arrayOFMahasiswa10[2].nim);
        System.out.println("Nama    : " + arrayOFMahasiswa10[2].nama);
        System.out.println("Kelas   : " + arrayOFMahasiswa10[2].kelas);
        System.out.println("IPK     : " + arrayOFMahasiswa10[2].ipk);
        System.out.println("---------------------------------------");
    }
}

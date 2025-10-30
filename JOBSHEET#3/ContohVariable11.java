public class ContohVariable11 {

    public static void main(String[] args) {
        String HobySayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char Kelamin = 'L';
        byte umurSayaSekarang = 20;
        double ipk = 3.24, tinggi = 1.78;
        System.out.println(HobySayaAdalah);
        System.out.println("Apakah Pandai? " + isPandai);
        System.out.println("Jenis Kelamin " + Kelamin);
        System.out.println("Umurku saat ini" + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}
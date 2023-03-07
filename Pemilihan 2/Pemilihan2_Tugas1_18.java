import java.util.Scanner;
public class Pemilihan2_Tugas1_18{
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);
        String kelasEksekutif = "Eksekutif", kelasBisnis = "Bisnis", kelasLuxury = "Luxury", kodeKeberangkatan;
        int biayaKelasEksekutif = 1250000, biayaKelasBisnis = 1375000, biayaKelasLuxury = 2500000, biayaAdministrasi = 50000, totalBayar;

        System.out.print("Masukkan Kode Keberangkatan [pg/sg/mg/reg] : ");
        kodeKeberangkatan = scan.nextLine();

        if (kodeKeberangkatan.equalsIgnoreCase("pg")){
            System.out.print("Kode Keberangkatan : " + kodeKeberangkatan);
            System.out.print("\nKelas Kereta\t: " + kelasEksekutif);
            System.out.print("\nBiaya Tiket\t: " + biayaKelasEksekutif);
            totalBayar = biayaKelasEksekutif + biayaAdministrasi;
            System.out.print("\nTotal Bayar\t: " + totalBayar);
        } else if (kodeKeberangkatan.equalsIgnoreCase("sg")){
            System.out.print("Kode Keberangkatan : " + kodeKeberangkatan);
            System.out.print("\nKelas Kereta\t: " + kelasBisnis);
            System.out.print("\nBiaya Tiket\t: " + biayaKelasBisnis);
            totalBayar = biayaKelasBisnis + biayaAdministrasi;
            System.out.print("\nTotal Bayar\t: " + totalBayar);
        } else if (kodeKeberangkatan.equalsIgnoreCase("mg")){
            System.out.print("Kode Keberangkatan : " + kodeKeberangkatan);
            System.out.print("\nKelas Kereta\t: " + kelasLuxury);
            System.out.print("\nBiaya Tiket\t: " + biayaKelasLuxury);
            totalBayar = biayaKelasLuxury + biayaAdministrasi;
            System.out.print("\nTotal Bayar\t: " + totalBayar);
        } else if (kodeKeberangkatan.equalsIgnoreCase("reg")){
            System.out.println("Mohon maaf untuk kereta api kelas reguler sedang tidak beroperasi");
        } else {
            System.out.println("Kode yang Anda masukkan salah! [pg/sg/mg/reg]");
        }
    }
}
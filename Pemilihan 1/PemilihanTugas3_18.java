import java.util.Scanner;
public class PemilihanTugas3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nilai_uas, nilai_uts, nilai_kuis, nilai_tugas;
        double nilai_akhir;

        System.out.print("Masukkan nilai UAS : ");
        nilai_uas = input.nextFloat();
        System.out.print("\nMAsukkan nilai UTS : ");
        nilai_uts = input.nextFloat();
        System.out.print("\nMasukkan nilai KUIS : ");
        nilai_kuis = input.nextFloat();
        System.out.print("\nMasukkan nilai TUGAS : ");
        nilai_tugas = input.nextFloat();

        nilai_akhir = ((0.4) * nilai_uas) + ((0.3) * nilai_uts) + ((0.1) * nilai_kuis) + ((0.2) * nilai_tugas);
        System.out.println("----------------------------------");
        System.out.println("Nilai akhir : " + nilai_akhir);
        if (nilai_akhir < 65){
            System.out.println("Remidi, tingkatkan lagi");
        }
        else {
            System.out.println("Tuntas");
        }
        System.out.println("----------------------------------");
    }
}
import java.util.Scanner;

public class TugasArray1{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double nilaiAkhir;
        char grade;
        String namaKaryawan[];
        namaKaryawan = new String[3];
        int kehadiran[];
        kehadiran = new int[namaKaryawan.length];
        int kerapian[];
        kerapian = new int[namaKaryawan.length];
        int hasilKerja[];
        hasilKerja = new int[namaKaryawan.length];

        for(int i=0; i < namaKaryawan.length; i++){
            System.out.printf("\nMasukkan Nama Karyawan\t\t: ");
            namaKaryawan[i] = scan.next();
            System.out.printf("Masukkan Kehadiran " + namaKaryawan[i] + "\t: ");
            kehadiran[i] = scan.nextInt();
            System.out.printf("Masukkan Kerapian " + namaKaryawan[i] + "\t\t: ");
            kerapian[i] = scan.nextInt();
            System.out.printf("Masukkan Hasil Kerja " + namaKaryawan[i] + "\t: ");
            hasilKerja[i] = scan.nextInt();
            nilaiAkhir = (0.3) * kehadiran[i] + (0.3) * kerapian[i] + (0.4) * hasilKerja[i];
            System.out.println("Nilai Akhir\t\t\t: " + nilaiAkhir);

            if (nilaiAkhir >= 80 && nilaiAkhir <= 100){
                grade = 'A';
                System.out.println("Grade Karyawan\t\t\t: " + grade);
            } else if (nilaiAkhir >= 70 && nilaiAkhir < 80){
                grade = 'B';
                System.out.println("Grade Karyawan\t\t\t: " + grade);
            } else if (nilaiAkhir >= 59 && nilaiAkhir < 70){
                grade = 'C';
                System.out.println("Grade Karyawan\t\t\t: " + grade);
            } else if (nilaiAkhir >= 50 && nilaiAkhir < 59){
                grade = 'D';
                System.out.println("Grade Karyawan\t\t\t: " + grade);
            } else if (nilaiAkhir <50){
                grade = 'E';
                System.out.println("Grade Karyawan\t\t\t: " + grade);
            } else {
                System.out.println("Nilai yang anda masukkan tidak sesuai!");
            }
        }
    }
}
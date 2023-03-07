import java.util.Scanner;
public class PemilihanTugas4_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C, total_belanja, total_barang_A, total_barang_B, total_barang_C, jumlah_barang_A, jumlah_barang_B, jumlah_barang_C, total_A_B_C;
        double diskon_total, total_bayar;

        System.out.println("Masukkan Harga Barang A");
        A = input.nextInt();
        System.out.println("Masukkan Jumlah Barang A");
        jumlah_barang_A = input.nextInt();
        System.out.println("Masukkan Harga Barang B");
        B = input.nextInt();
        System.out.println("Masukkan Jumlah Barang B");
        jumlah_barang_B = input.nextInt();
        System.out.println("Masukkan Harga Barang C");
        C = input.nextInt();
        System.out.println("Masukkan Jumlah Barang C");
        jumlah_barang_C = input.nextInt();

        total_barang_A = A * jumlah_barang_A;
        total_barang_B = B * jumlah_barang_B;
        total_barang_C = C * jumlah_barang_C;

        total_A_B_C = total_barang_A + total_barang_B + total_barang_C;
        
        System.out.println("--------------------------------------------");
        System.out.println("\t\tStruk Nota");
        System.out.println("--------------------------------------------");
        
        System.out.println("Nama Barang\t Harga   Jumlah\t Total");
        System.out.println("  Barang A\t " + A + "\t " + jumlah_barang_A + "\t " + total_barang_A);
        System.out.println("  Barang B\t " + B + "\t " + jumlah_barang_B + "\t " + total_barang_B);
        System.out.println("  Barang C\t " + C + "\t " + jumlah_barang_C + "\t " + total_barang_C);
        System.out.println("\tTotal\t\t\t: " + total_A_B_C);

                if (total_A_B_C > 200000 && total_A_B_C <= 500000){
                    diskon_total = total_A_B_C * (0.02);
                    total_bayar = total_A_B_C - diskon_total;
                    System.out.println("\tDiskon\t\t\t: " + diskon_total);
                    System.out.println("\tTotal Bayar\t\t: " + total_bayar);
                }
                else if (total_A_B_C > 500000 && total_A_B_C <= 1000000) {
                    diskon_total = total_A_B_C * (0.05);
                    total_bayar = total_A_B_C - diskon_total;
                    System.out.println("\tDiskon\t\t\t: " + diskon_total);
                    System.out.println("\tTotal Bayar\t\t: " + total_bayar);
                }
                else if (total_A_B_C > 1000000) {
                    diskon_total = total_A_B_C * (0.1);
                    total_bayar = total_A_B_C - diskon_total;
                    System.out.println("\tDiskon\t\t\t: " + diskon_total);
                    System.out.println("\tTotal Bayar\t\t: " + total_bayar);
                }
                else {
                    System.out.println("Pembelian kurang dari Rp. 200.000,00");
                }

    }
}
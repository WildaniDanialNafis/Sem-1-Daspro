//19_Wildani Danial NAfis
//MI1A
import java.util.Scanner;
public class QuizII_WildaniDanialNafis{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] discount = {"Cashback 7.5%", "Diskon 7%", "Diskon 10.5%", "Cashback 10%", "Diskon 9%", "Diskon 9.5%", "Diskon 12.5%"};
        double[] goPay = {0.075, 0.07, 0.105, 0.1, 0.09, 0.095, 0.125};
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
        int uang, pembelanjaan;
        String hariBeli, vendor;
        double totalPembelanjaan, harusDibayar, sisaUang;

        System.out.print("Uang yang Anda Milikki\t\t\t: ");
        uang = input.nextInt();
        System.out.print("Total Pembelanjaan\t\t\t: ");
        pembelanjaan = input.nextInt();
        System.out.print("Masukkan hari\t\t\t\t: ");
        hariBeli = input.next();
        System.out.print("Vendor Dompet Digital yang digunakan\t: ");
        vendor = input.next();
        System.out.println("----------------------------------------------------");

        if (hariBeli.equalsIgnoreCase(hari[0])){
            System.out.print("Jenis Promo yang Anda Dapatkan\t\t: " + discount[0]);
            totalPembelanjaan = goPay[0] * pembelanjaan;
            sisaUang = uang - pembelanjaan + totalPembelanjaan;  
            System.out.println("\nYang Harus Dibayar\t\t\t: " + pembelanjaan);
            System.out.println("Sisa Uang yang Anda Milikki\t\t: " + sisaUang);
        }
        else if (hariBeli.equalsIgnoreCase(hari[1])){
            System.out.print("Jenis Promo yang Anda Dapatkan\t\t: " + discount[1]);
            totalPembelanjaan = goPay[1] * pembelanjaan;
            harusDibayar = pembelanjaan - totalPembelanjaan;
            sisaUang = uang - harusDibayar;  
            System.out.println("\nYang Harus Dibayar\t\t\t: " + harusDibayar);
            System.out.println("Sisa Uang yang Anda Milikki\t\t: " + sisaUang);
        }
        else if (hariBeli.equalsIgnoreCase(hari[2])){
            System.out.print("Jenis Promo yang Anda Dapatkan\t\t: " + discount[2]);
            totalPembelanjaan = goPay[2] * pembelanjaan;
            harusDibayar = pembelanjaan - totalPembelanjaan;
            sisaUang = uang - harusDibayar;  
            System.out.println("\nYang Harus Dibayar\t\t\t: " + harusDibayar);
            System.out.println("Sisa Uang yang Anda Milikki\t\t: " + sisaUang);
        }
        else if (hariBeli.equalsIgnoreCase(hari[3])){
            System.out.print("Jenis Promo yang Anda Dapatkan\t\t: " + discount[3]);
            totalPembelanjaan = goPay[3] * pembelanjaan;
            sisaUang = uang - pembelanjaan + totalPembelanjaan;  
            System.out.println("\nYang Harus Dibayar\t\t\t: " + pembelanjaan);
            System.out.println("Sisa Uang yang Anda Milikki\t\t: " + sisaUang);
        }
        else if (hariBeli.equalsIgnoreCase(hari[4])){
            System.out.print("Jenis Promo yang Anda Dapatkan\t\t: " + discount[4]);
            totalPembelanjaan = goPay[4] * pembelanjaan;
            harusDibayar = pembelanjaan - totalPembelanjaan;
            sisaUang = uang - harusDibayar;  
            System.out.println("\nYang Harus Dibayar\t\t\t: " + harusDibayar);
            System.out.println("Sisa Uang yang Anda Milikki\t\t: " + sisaUang);
        }
        else if (hariBeli.equalsIgnoreCase(hari[5])){
            System.out.print("Jenis Promo yang Anda Dapatkan\t\t: " + discount[5]);
            totalPembelanjaan = goPay[5] * pembelanjaan;
            harusDibayar = pembelanjaan - totalPembelanjaan;  
            sisaUang = uang - harusDibayar;  
            System.out.println("\nYang Harus Dibayar\t\t\t: " + harusDibayar);
            System.out.println("Sisa Uang yang Anda Milikki\t\t: " + sisaUang);
        }
        else if (hariBeli.equalsIgnoreCase(hari[6])){
            System.out.print("Jenis Promo yang Anda Dapatkan\t\t: " + discount[6]);
            totalPembelanjaan = goPay[6] * pembelanjaan;
            harusDibayar = pembelanjaan - totalPembelanjaan;
            sisaUang = uang - harusDibayar;  
            System.out.println("\nYang Harus Dibayar\t\t\t: " + harusDibayar);
            System.out.println("Sisa Uang yang Anda Milikki\t\t: " + sisaUang);
        }
        
    
    }
}
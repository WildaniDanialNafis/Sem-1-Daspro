//18_Wildani Danial Nafis
//MI
import java.util.Scanner;

public class UTS_WildaniDanialNafis2{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int uangPembayaran, totalPembelanjaan;
        double cashback, sisaUang, diskon;
        String hari, vendor;

        System.out.print("Uang yang Anda Miliki\t\t\t: ");
        uangPembayaran = scan.nextInt();
        System.out.print("Total pembelanjaan\t\t\t: ");
        totalPembelanjaan = scan.nextInt();
        System.out.print("Masukkan Hari\t\t\t\t: ");
        hari = scan.next();
        System.out.print("Vendor Dompet Digital yang digunakan\t: ");
        vendor = scan.next();
        System.out.println("------------------------------------------------------");
        
        if (vendor.equalsIgnoreCase("gopay")){
            if (hari.equalsIgnoreCase("senin")){
                System.out.println("Jenis Promo yang Anda Dapatkan\t\t: Cashback 10%");
                System.out.printf("Uang yang Harus Dibayarkan\t\t: %d\n", totalPembelanjaan);
                cashback = totalPembelanjaan * (0.1);
                sisaUang = (uangPembayaran - totalPembelanjaan) + cashback;
                System.out.println("Sisa Uang yang Anda Miliki\t\t: "+ sisaUang);
            }
            else if (hari.equalsIgnoreCase("selasa")){
                System.out.println("Jenis Promo yang Anda Dapatkan\t\t: Diskon 10%");
                System.out.printf("Uang yang Harus Dibayarkan\t\t: %d\n", totalPembelanjaan);
                diskon = totalPembelanjaan * (0.1);
                totalPembelanjaan -= diskon;
                sisaUang = uangPembayaran - totalPembelanjaan;
                System.out.println("Sisa Uang yang Anda Miliki\t\t: "+ sisaUang);   
            }
            else if (hari.equalsIgnoreCase("rabu")){
                System.out.println("Jenis Promo yang Anda Dapatkan\t\t: Diskon 15%");
                System.out.printf("Uang yang Harus Dibayarkan\t\t: %d\n", totalPembelanjaan);
                diskon = totalPembelanjaan * (0.15);
                totalPembelanjaan -= diskon;
                sisaUang = uangPembayaran - totalPembelanjaan;
                System.out.println("Sisa Uang yang Anda Miliki\t\t: "+ sisaUang);   
            }
            else if (hari.equalsIgnoreCase("kamis")){
                System.out.println("Jenis Promo yang Anda Dapatkan\t\t: Cashback 10%");
                System.out.printf("Uang yang Harus Dibayarkan\t\t: %d\n", totalPembelanjaan);
                cashback = totalPembelanjaan * (0.1);
                sisaUang = (uangPembayaran - totalPembelanjaan) + cashback;
                System.out.println("Sisa Uang yang Anda Miliki\t\t: "+ sisaUang);
            }
            else if (hari.equalsIgnoreCase("jumat")){
                System.out.println("Jenis Promo yang Anda Dapatkan\t\t: Diskon 10%");
                System.out.printf("Uang yang Harus Dibayarkan\t\t: %d\n", totalPembelanjaan);
                diskon = totalPembelanjaan * (0.1);
                totalPembelanjaan -= diskon;
                sisaUang = uangPembayaran - totalPembelanjaan;
                System.out.println("Sisa Uang yang Anda Miliki\t\t: "+ sisaUang);   
            }
            else if (hari.equalsIgnoreCase("sabtu")){
                System.out.println("Jenis Promo yang Anda Dapatkan\t\t: Diskon 15%");
                System.out.printf("Uang yang Harus Dibayarkan\t\t: %d\n", totalPembelanjaan);
                diskon = totalPembelanjaan * (0.15);
                totalPembelanjaan -= diskon;
                sisaUang = uangPembayaran - totalPembelanjaan;
                System.out.println("Sisa Uang yang Anda Miliki\t\t: "+ sisaUang);   
            }
            else if (hari.equalsIgnoreCase("minggu")){
                System.out.println("Jenis Promo yang Anda Dapatkan\t\t: Diskon 20%");
                System.out.printf("Uang yang Harus Dibayarkan\t\t: %d\n", totalPembelanjaan);
                diskon = totalPembelanjaan * (0.2);
                totalPembelanjaan -= diskon;
                sisaUang = uangPembayaran - totalPembelanjaan;
                System.out.println("Sisa Uang yang Anda Miliki\t\t: "+ sisaUang);   
            }
            else {
                System.out.println("Anda menginputkan Nama Hari yang salah!!!");
            }
        } 
        else if (vendor.equalsIgnoreCase("ovo")){
            if (hari.equalsIgnoreCase("senin")){
                System.out.println("Jenis Promo yang Anda Dapatkan\t\t: Diskon 10%");
                System.out.printf("Uang yang Harus Dibayarkan\t\t: %d\n", totalPembelanjaan);
                diskon = totalPembelanjaan * (0.1);
                totalPembelanjaan -= diskon;
                sisaUang = uangPembayaran - totalPembelanjaan;
                System.out.println("Sisa Uang yang Anda Miliki\t\t: "+ sisaUang);   
            }
            else if (hari.equalsIgnoreCase("selasa")){
                System.out.println("Jenis Promo yang Anda Dapatkan\t\t: Cashback 15%");
                System.out.printf("Uang yang Harus Dibayarkan\t\t: %d\n", totalPembelanjaan);
                cashback = totalPembelanjaan * (0.15);
                sisaUang = (uangPembayaran - totalPembelanjaan) + cashback;
                System.out.println("Sisa Uang yang Anda Miliki\t\t: "+ sisaUang);
            }
            else if (hari.equalsIgnoreCase("rabu")){
                System.out.println("Jenis Promo yang Anda Dapatkan\t\t: Diskon 15%");
                System.out.printf("Uang yang Harus Dibayarkan\t\t: %d\n", totalPembelanjaan);
                diskon = totalPembelanjaan * (0.15);
                totalPembelanjaan -= diskon;
                sisaUang = uangPembayaran - totalPembelanjaan;
                System.out.println("Sisa Uang yang Anda Miliki\t\t: "+ sisaUang);   
            }
            else if (hari.equalsIgnoreCase("kamis")){
                System.out.println("Jenis Promo yang Anda Dapatkan\t\t: Diskon 10%");
                System.out.printf("Uang yang Harus Dibayarkan\t\t: %d\n", totalPembelanjaan);
                diskon = totalPembelanjaan * (0.1);
                totalPembelanjaan -= diskon;
                sisaUang = uangPembayaran - totalPembelanjaan;
                System.out.println("Sisa Uang yang Anda Miliki\t\t: "+ sisaUang);   
            }
            else if (hari.equalsIgnoreCase("jumat")){
                System.out.println("Jenis Promo yang Anda Dapatkan\t\t: Diskon 15%");
                System.out.printf("Uang yang Harus Dibayarkan\t\t: %d\n", totalPembelanjaan);
                diskon = totalPembelanjaan * (0.15);
                totalPembelanjaan -= diskon;
                sisaUang = uangPembayaran - totalPembelanjaan;
                System.out.println("Sisa Uang yang Anda Miliki\t\t: "+ sisaUang);   
            }
            else if (hari.equalsIgnoreCase("sabtu")){
                System.out.println("Jenis Promo yang Anda Dapatkan\t\t: Cashback 10%");
                System.out.printf("Uang yang Harus Dibayarkan\t\t: %d\n", totalPembelanjaan);
                cashback = totalPembelanjaan * (0.1);
                sisaUang = (uangPembayaran - totalPembelanjaan) + cashback;
                System.out.println("Sisa Uang yang Anda Miliki\t\t: "+ sisaUang);
            }
            else if (hari.equalsIgnoreCase("minggu")){
                System.out.println("Jenis Promo yang Anda Dapatkan\t\t: Diskon 15%");
                System.out.printf("Uang yang Harus Dibayarkan\t\t: %d\n", totalPembelanjaan);
                diskon = totalPembelanjaan * (0.15);
                totalPembelanjaan -= diskon;
                sisaUang = uangPembayaran - totalPembelanjaan;
                System.out.println("Sisa Uang yang Anda Miliki\t\t: "+ sisaUang);   
            }
            else {
                System.out.println("Anda menginputkan Nama Hari yang salah!!!");
            }
        }
        else {
            System.out.println("Anda menginputkan Nama Vendor yang salah!!!");
        }
    }
}
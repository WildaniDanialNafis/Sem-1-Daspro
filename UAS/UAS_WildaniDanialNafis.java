import java.util.Scanner;

public class UAS_WildaniDanialNafis{
    
    static String[] namaSembako(int jumlah){  
        Scanner input = new Scanner(System.in);
        String[] arraySembako = new String[jumlah];
        for (int i= 0; i < jumlah; i++){
            System.out.print("| Nama Barang ke-"+(i+1)+ " : ");
            arraySembako[i] = input.next();
        }
        return arraySembako;
    }
    static double[] hargaSembako(int jumlah, String[] sembako){
        Scanner input = new Scanner(System.in);
        double[] arrayHarga = new double[jumlah];
        for (int i= 0; i < jumlah; i++){
            System.out.print("| Harga " + sembako[i] + " : ");
            arrayHarga[i] = input.nextDouble();
        }
        return arrayHarga;
    }
    static int[] stokSembako(int jumlah, String[] sembako){
        Scanner input = new Scanner(System.in);
        int[] arrayStok = new int[jumlah];
        for (int i= 0; i < jumlah; i++){
            System.out.print("| Jumlah " + sembako[i] + " : ");
            arrayStok[i] = input.nextInt();
        }
        return arrayStok;
    }
    static String[] namaDibeli(String[] namaSembako,String[] namaDibeli, String nama){
        String[] sembakoDibeli = namaDibeli;
        for (int i= 0; i < namaSembako.length; i++){
            if (nama.equalsIgnoreCase(namaSembako[i]) && sembakoDibeli[i] == null){
                sembakoDibeli[i] = nama;
            }
        }
        return sembakoDibeli;
    }
    static int[] stokDibeli(String[] namaSembako, int[] jumlahStok, int[] stokTersedia, String nama, int banyakDibeli){
        int[] stokBaru = jumlahStok;
        for (int i= 0; i < namaSembako.length; i++){
            if (nama.equalsIgnoreCase(namaSembako[i]) && stokBaru[i] != 0){
                stokBaru[i] = stokBaru[i] - banyakDibeli;
            } else if (nama.equalsIgnoreCase(namaSembako[i])){
                stokBaru[i] = jumlahStok[i] - banyakDibeli;
            }
        }
        return stokBaru;
    }
    static int[] jumlahDibeli(String[] namaSembako,int[] banyakDibeli, String nama, int sembakoDibeli){
        int[] banyakSembako = banyakDibeli;
        for (int i= 0; i < namaSembako.length; i++){
            if (nama.equalsIgnoreCase(namaSembako[i]) && banyakSembako[i] == 0){
                banyakSembako[i] = sembakoDibeli;
            } else if (nama.equalsIgnoreCase(namaSembako[i])){
                banyakSembako[i] = banyakSembako[i] + sembakoDibeli;
            }
        }
        return banyakSembako;
    }
    static double[] hargaKaliBanyak(int[] banyakDibeli, double[] harga){
        double[] hargaSembako = new double[banyakDibeli.length];
        for (int i= 0; i < banyakDibeli.length; i++){
            hargaSembako[i] = banyakDibeli[i] * harga[i];
        }
        return hargaSembako;
    } 
    static double total(String[] namaSembako, double[] harga, String nama, int banyakDibeli){
        double hargaSembako;
        double totalHarga = 0;
        for (int i= 0; i < namaSembako.length; i++){
            if (nama.equalsIgnoreCase(namaSembako[i])){
                hargaSembako = banyakDibeli * harga[i]; 
                totalHarga += hargaSembako;
            }
        }
        return totalHarga;
    }
    static boolean submit(){
        Scanner input = new Scanner(System.in);
        String submit;
        System.out.print("| Barang yang dibeli sudah cukup (t/y)? ");
        submit = input.next();
        if (submit.equalsIgnoreCase("t")){
            return true;
        } else if (submit.equalsIgnoreCase("y")){
            return false;
        } else {
            System.out.println("| YANG ANDA MASUKKAN SALAH!!!");
            return submit();
        }
    }
    static boolean submit2(){
        Scanner input = new Scanner(System.in);
        String submit;
        System.out.print("\n| Apakah ada transaksi pembelian lagi(y/t)? ");
        submit = input.next();
        if (submit.equalsIgnoreCase("y")){
            return true;
        } else if (submit.equalsIgnoreCase("t")){
            return false;
        } else {
            System.out.println("| YANG ANDA MASUKKAN SALAH!!!");
            return submit2();
        }
    }
    static double totalPembayaran(int kartuMember, double total){
        double tagihan;
        if (kartuMember == 1){
            tagihan = total - (total* 0.05);
            return tagihan;
        } else {
            tagihan = total * 1;
            return tagihan;
        }
    }
    static double kembalian(double total){
        int uang;
        Scanner input = new Scanner(System.in);
        System.out.print("| TUNAI\t\t: ");
        uang = input.nextInt();
        return (uang-total);
    }
    static void tampilStok(String[] sembako, int[] jumlahStok){
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("|\t\t\tStok Tersisa");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        for (int i= 0; i < sembako.length; i++){
            System.out.println("| " + sembako[i] + "\t\t" + jumlahStok[i]);
        }
    }
    static int[] restok(String[] namaSembako, int[] stokTersedia, String nama, int banyakRestok){
        int[] stokRestok = stokTersedia;
        for (int i= 0; i < namaSembako.length; i++){
            if (nama.equalsIgnoreCase(namaSembako[i])){
                stokRestok[i] = stokRestok[i] + banyakRestok;
            }
        }
        return stokRestok;
    }
    static boolean submit3(){
        Scanner input = new Scanner(System.in);
        String submit;
        System.out.print("\n| Apakah mau restok lagi(y/t)? ");
        submit = input.next();
        if (submit.equalsIgnoreCase("y")){
            return true;
        } else if (submit.equalsIgnoreCase("t")){
            return false;
        } else {
            System.out.println("| YANG ANDA MASUKKAN SALAH!!!");
            return submit3();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah, member, kartu;
        double totalPembayaran;
        
        System.out.println("|=======================================================|");
        System.out.println("|\t  Selamat Datang di Toko Sembako Berkah\t\t|");
        System.out.println("|=======================================================|");
        System.out.print("| Masukkan jumlah jenis barang : ");
        jumlah = input.nextInt();                  
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|\t\t\tMENU STOK");
        System.out.println("|-------------------------------------------------------|");
        
        String[] sembako = new String[jumlah];
        double[] harga = new double[jumlah];
        int[] stok = new int[jumlah];
        
        sembako = namaSembako(jumlah);
        System.out.println("|-------------------------------------------------------|");
        harga = hargaSembako(jumlah, sembako);
        System.out.println("|-------------------------------------------------------|");
        stok = stokSembako(jumlah, sembako);
        boolean sudah = true;
        
        while (sudah) {
        System.out.println("|=======================================================|");
        System.out.println("|\t\t\tMENU PEMBELIAN");
        System.out.println("|=======================================================|");
            
        int banyak, banyakRestok;
        String nama, namaRestok, tanyaRestok;
        double total = 0;
        boolean statement = true;
        int[] stokBaru = new int[jumlah];
        int[] banyakDibeli = new int[jumlah]; 
        String[] sembakoDibeli = new String[jumlah];

        while (statement){
                System.out.print("| Nama sembako yang dibeli : ");
                nama = input.next();
                System.out.print("| Jumlah pembelian : ");
                banyak = input.nextInt();
                banyakDibeli = jumlahDibeli(sembako, banyakDibeli, nama, banyak);
                stokBaru = stokDibeli(sembako, stok, stokBaru, nama, banyak);
                total = total + total(sembako, harga, nama, banyak);
                sembakoDibeli = namaDibeli(sembako, sembakoDibeli, nama);
                statement = submit();
            }
            double[] hargaSembako = hargaKaliBanyak(banyakDibeli, harga);
            System.out.println("|-------------------------------------------------------|");     
            System.out.println("| Kartu Member");
            System.out.println("| 1.\tAda");
            System.out.println("| 2.\tTidak Ada");
            System.out.print("| (1/2) : ");
            member = input.nextInt();
            
            System.out.println("|-------------------------------------------------------|");
            System.out.println("| Masukkan jenis pembayaran");
            System.out.println("| 1.\tCash");
            System.out.println("| 2.\tKartu Debit");
            System.out.print("| (1/2) : ");
            kartu = input.nextInt();
            
            System.out.println("|=======================================================|");
            System.out.println("|\t\t\tToko Sembako Berkah");
            System.out.println("|\tJL. STADION NO.IX/03, OMBUL,LAWANGAN DAYA"); 
            System.out.println("|\t\tKEC. PADEMAWU, KAB. PAMEKASAN, 69323");
            System.out.println("|--------------------------------------------------------");
            
            for (int i= 0; i < stokBaru.length; i++){ 
                if (sembakoDibeli[i]!=null && banyakDibeli[i]!=0 && harga[i]!=0 && hargaSembako[i]!=0){
                    System.out.println("| " + sembakoDibeli[i] + "\t" + banyakDibeli[i] + "\t" + harga[i] + "\t" + hargaSembako[i]);
                }
            }
            System.out.println("|--------------");
            System.out.println("| HARGA JUAL\t: " + total);
            System.out.println("|--------------");
            totalPembayaran = totalPembayaran(member, total);
            System.out.println("| TOTAL\t\t: " + totalPembayaran);
            System.out.println("| KEMBALI\t: " + kembalian(totalPembayaran));
            
            System.out.println("|=======================================================|");
            System.out.println("|\t\tTerima Kasih Sudah Berbelanja"); 
            System.out.println("|\t\t\tToko Barokah");
            System.out.println("|=======================================================|");
            System.out.print("| Apakah anda mau restok(y/t)? ");
            tanyaRestok = input.next();
            if (tanyaRestok.equalsIgnoreCase("y")){
                boolean ulangRestok = true;
                while (ulangRestok){
                    System.out.print("| Masukkan nama Sembako (restok) : ");
                    namaRestok = input.next();
                    System.out.print("| Masukkan jumlah "+ namaRestok + " (direstok) : ");
                    banyakRestok = input.nextInt();
                    stokBaru = restok(sembako, stokBaru, namaRestok, banyakRestok);
                    ulangRestok = submit3();
                    }
                }
            else if (tanyaRestok.equalsIgnoreCase("t")) {
                sudah = submit2();
                tampilStok(sembako, stokBaru);
                System.out.println("|=======================================================|");
            }
            else {
                System.out.println("| YANG ANDA MASUKKAN SALAH!!!");
            }
        }
    }
}
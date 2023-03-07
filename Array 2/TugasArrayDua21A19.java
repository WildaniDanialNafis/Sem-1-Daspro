import java.util.Scanner;

public class TugasArrayDua21A19{
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int[][] buku = new int[3][4];
        int[] tertinggi = new int [3];
        int[] harga = {40000, 28000, 60000, 75000};
        String[] cabang = {"Dieng", "Soehat", "Sengkaling"};
        String[] jenis = {"Novel", "Komik", "Pelajaran", "Ensiklopedi"};
        int[] perJenisBuku ={0, 0, 0, 0};
        int total = 0, pemTertinggi = 0, bukuTerjual = 0, perBuku = 0, perCabang = 0;
        String cabTertinggi = "";
  
        System.out.println("---------------------------");
        System.out.println("List Harga");
        System.out.println("---------------------------");
        for (int j = 0; j < harga.length; j++){
            System.out.printf("Masukkan harga %s: Rp. ", jenis[j]);
            harga[j] = scan.nextInt();
        }
        for (int baris = 0; baris < buku.length; baris++){
            System.out.println("---------------------------------------");
            System.out.println(cabang[baris]);
            System.out.println("---------------------------------------");
            for (int kolom = 0; kolom < buku[0].length; kolom++){
                switch(kolom){
                    case 0 :
                    System.out.printf("Masukkan Jumlah Buku %s \t\t: ", jenis[kolom]);
                    buku[baris][kolom] = scan.nextInt(); 
                    break;
                    case 1 :
                    System.out.printf("Masukkan Jumlah Buku %s \t\t: ", jenis[kolom]);
                    buku[baris][kolom] = scan.nextInt(); 
                    break;
                    case 2 :
                    System.out.printf("Masukkan Jumlah Buku %s \t\t: ", jenis[kolom]);
                    buku[baris][kolom] = scan.nextInt(); 
                    break;                        
                    case 3 :
                    System.out.printf("Masukkan Jumlah Buku %s \t: ", jenis[kolom]);
                    buku[baris][kolom] = scan.nextInt();
                    break;
                }
                bukuTerjual += buku[baris][kolom];
                switch (kolom){
                    case 0 :
                    perBuku = buku[baris][kolom] * harga[kolom];
                    break;
                    case 1 :
                    perBuku = buku[baris][kolom] * harga[kolom];
                    break;
                    case 2 :
                    perBuku = buku[baris][kolom] * harga[kolom];
                    break;
                    case 3 :
                    perBuku = buku[baris][kolom] * harga[kolom];
                    break;
                }
                perCabang += perBuku;
            }
            switch (baris) {
                case 0 :
                System.out.printf("Banyak buku terjual  \t\t\t: %d pcs\n", bukuTerjual);
                System.out.printf("Total pemasukan  \t\t\t: Rp. %d\n", perCabang);
                bukuTerjual = 0;
                break;
                case 1 :
                System.out.printf("Banyak buku terjual  \t\t\t: %d pcs\n", bukuTerjual);
                System.out.printf("Total pemasukan  \t\t\t: Rp. %d\n", perCabang);
                bukuTerjual = 0;
                break;
                case 2 :
                System.out.printf("Banyak buku terjual  \t\t\t: %d pcs\n", bukuTerjual);
                System.out.printf("Total pemasukan  \t\t\t: Rp. %d\n", perCabang);
                bukuTerjual = 0;
                break;
            }
            tertinggi [baris] = perCabang;
            perCabang = 0;
        }
        for (int baris = 0; baris < buku.length; baris++){
            for (int kolom = 0; kolom < buku[0].length; kolom++){
                switch(kolom){
                    case 0 :
                    perJenisBuku[kolom] += buku[baris][kolom];
                    break;
                    case 1 :
                    perJenisBuku[kolom] += buku[baris][kolom];
                    break;
                    case 2 :
                    perJenisBuku[kolom] += buku[baris][kolom];
                    break;
                    case 3 :
                    perJenisBuku[kolom] += buku[baris][kolom];
                    break;
                }
            }
        }
        for (int i = 0; i < jenis.length; i++){
            total = perJenisBuku[i] * harga[i];
            total += total;
        }
        System.out.println("---------------------------------------");
        System.out.println("Total pemasukan Togamas adalah\t\t: Rp. " + total);
        for (int i = 0; i < tertinggi.length; i ++){
            if (tertinggi[i] > pemTertinggi){
                pemTertinggi = tertinggi[i];
                cabTertinggi = cabang[i];
            }
        }
        if (tertinggi[0] != tertinggi [1] && tertinggi[0] != tertinggi[2] && tertinggi[1] != tertinggi[2]){
            System.out.printf("Pemasukan tertinggi adalah cabang\t: %s\n", cabTertinggi);
            System.out.printf("Dengan total pemasukan\t\t\t: Rp. %d\n", pemTertinggi);
        } 
        else
        System.out.println("Ada 2 cabang memiliki pemasukan yang sama");
        System.out.println("---------------------------------------");
    }
}
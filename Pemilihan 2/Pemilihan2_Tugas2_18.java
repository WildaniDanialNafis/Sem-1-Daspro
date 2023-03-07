import java.util.Scanner;
public class Pemilihan2_Tugas2_18{
    public static void main(String[] args){
        
        Scanner scan = new Scanner (System.in);
        String menu, pilih;
        float sisi, rusuk, alas, tinggi, jari2;
        double luas, volume;

        System.out.println("Pilih Operasi untuk menghitung");
        System.out.println("------------------------------");
        System.out.println("1. Luas");
        System.out.println("2. Volume");
        System.out.print("Pilih (1 atau 2) : ");
        menu = scan.nextLine();
        
        if (menu.equals("1")){
            System.out.println("\nPilih Bangun Datar");
            System.out.println("------------------");
            System.out.println("a. Persegi");
            System.out.println("b. Segitiga");
            System.out.print("Pilih (a atau b) : ");
            pilih = scan.nextLine();
            
            if (pilih.equals("a")){
                System.out.print("\nPanjang sisi = ");
                sisi = scan.nextFloat();
                
                luas = sisi * sisi;
                System.out.println("-------------------");
                System.out.println("Luas Persegi = " + luas);
                System.out.println("-------------------");
            } else if (pilih.equals("b")){
                System.out.print("\nPanjang Alas = ");
                alas = scan.nextFloat();
                System.out.print("Tinggi = ");
                tinggi = scan.nextFloat();
                
                luas = (0.5) * alas * tinggi;
                System.out.println("-------------------");
                System.out.println("Luas Segitiga = " + luas);
                System.out.println("-------------------");
            } else {
                System.out.println("Pilihan yang Anda masukkan salah!");
            }
        } else if (menu.equals("2")){
            System.out.println("Pilih Bangun Ruang");
            System.out.println("------------------");
            System.out.println("a. Kubus");
            System.out.println("b. Tabung");
            System.out.print("Pilih (a atau b) : ");
            pilih = scan.nextLine();
            
            if (pilih.equals("a")){
                System.out.print("\nPanjang Rusuk = ");
                rusuk = scan.nextFloat();
                
                volume = rusuk * rusuk * rusuk;
                System.out.println("-------------------");
                System.out.println("Volume Kubus = " + volume);
                System.out.println("-------------------");
            } else if (pilih.equals("b")) {
                System.out.print("\nMasukkan Jari-jari = ");
                jari2 = scan.nextFloat();
                System.out.print("Masukkan Tinggi = ");
                tinggi = scan.nextFloat();
                
                volume = (3.14) * jari2 * jari2 * tinggi;
                System.out.println("-------------------");
                System.out.println("Volume Tabung = " + volume);
                System.out.println("-------------------");
            } else {
                System.out.println("Pilihan yang Anda masukkan salah!");
            }
        } else {
            System.out.println("Pilihan yang Anda masukkan salah!");
        }
    }
}
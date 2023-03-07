import java.util.Scanner;
public class Quiz1_Pragdasprog_WildaniDanialNafis{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a,b,c; //deklarasi nilai a b c
        
        System.out.println("Kalkulator sederhana");
        System.out.println("Masukkan nilai a");
        a = input.nextFloat(); // untuk memasukkan input dari user dengan nama variabel a
        System.out.println("Masukkan nilai b");
        b = input.nextFloat(); // untuk memasukkan input dari user dengan nama variabel b
          
        c = a + b; // untuk operasi penjumlahan
        System.out.println("Hasil operasi " + a + " + " + b + " = " + c);
        c = a - b; // untuk operasi pengurangan
        System.out.println("Hasil operasi " + a + " - " + b + " = " + c);
        c = a * b; // untuk operasi perkalian
        System.out.println("Hasil operasi " + a + " * " + b + " = " + c);
        c = a / b; // untuk operasi pembagian
        System.out.println("Hasil operasi " + a + " / " + b + " = " + c);
        c = a % b; // untuk operasi modulus
        System.out.println("Hasil operasi " + a + " % " + b + " = " + c);    

    }
}
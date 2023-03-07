//18_Wildani Danial Nafis
//MI
import java.util.Scanner;

public class UTS_WildaniDanialNafis{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int panjangSisiA, panjangSisiB, panjangSisiC;

        System.out.print("Masukkan Panjang Sisi A\t: ");
        panjangSisiA = scan.nextInt();
        System.out.print("Masukkan Panjang Sisi B\t: ");
        panjangSisiB = scan.nextInt();
        System.out.print("Masukkan Panjang Sisi C\t: ");
        panjangSisiC = scan.nextInt();

        
        if (panjangSisiA == panjangSisiB && panjangSisiA == panjangSisiC && panjangSisiB == panjangSisiC){  
            System.out.printf("\nSegitiga dengan Panjang Sisi A: %d, Sisi B: %d, Sisi C: %d adalah SEGITIGA SAMA SISI", panjangSisiA, panjangSisiB, panjangSisiC);
        }
        else if (panjangSisiA == panjangSisiB || panjangSisiA == panjangSisiC || panjangSisiB == panjangSisiC){
            System.out.printf("\nSegitiga dengan Panjang Sisi A: %d, Sisi B: %d, Sisi C: %d adalah SEGITIGA SAMA KAKI", panjangSisiA, panjangSisiB, panjangSisiC);
        }
        else {
            System.out.printf("\nSegitiga dengan Panjang Sisi A: %d, Sisi B: %d, Sisi C: %d adalah SEGITIGA SEMBARANG", panjangSisiA, panjangSisiB, panjangSisiC);
        }
    }
}
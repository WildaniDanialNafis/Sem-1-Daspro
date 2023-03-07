import java.util.Scanner;
public class DeretDescendingRekursif{
    static void tampilIteratif(int n){
        for (int i = n; i >= 0; i--){
            System.out.print(i + " ");
        }
    }
    static int tampilRekursif(int n){
        if (n == 0) {
            System.out.print("0");
            return 0;
        } else {
            System.out.print(n + " ");
            return tampilRekursif(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Masukkan (n) : ");
        n = input.nextInt();

        System.out.println("--------------------------");
        System.out.println("Tampilan Fungsi Iteratif");
        tampilIteratif(n);
        
        System.out.println("\nTampilan Fungsi Rekursif");
        tampilRekursif(n);
    }
}
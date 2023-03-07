import java.util.Scanner;
public class PenjumlahanRekursif{
    static int penjumlahanDeret (int n){
        int hasil;
        if (n == 1){
            return (1);
        } else {
            return n + penjumlahanDeret(n - 1);
        }
    }
    static void tampilPenjumlahan(int n){
        for (int i = 1; i <= n; i++){
            System.out.print(i);
            if (i != n){
                System.out.print("+");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f;

        System.out.print("Masukkan (f) : ");
        f = input.nextInt();

        System.out.println("-------------------------------");
        tampilPenjumlahan(f);
        System.out.print(" = " + penjumlahanDeret(f));
    }
}
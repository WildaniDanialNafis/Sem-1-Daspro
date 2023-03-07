import java.util.Scanner;
public class PemilihanTugas1_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.print("Masukkan bilangan pertama : ");
        x = input.nextInt();
        System.out.print("\nMasukkan bilangan kedua : ");
        y = input.nextInt();
        if (x > y) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Bilangan terbesar = " + x + ", bilangan terkecil = " + y);
            System.out.println("-------------------------------------------------------");
        }
        else {
            System.out.println("-------------------------------------------------------");
            System.out.println("Bilangan terbesar = " + y + ", bilangan terkecil = " + x);
            System.out.println("-------------------------------------------------------");
        }
    }
}
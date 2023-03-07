import java.util.Scanner;
public class Fibonacci{
    static int fibonacci(int n){ // f(4) = f(3) + f(1) + f(0), f(3) = f(2) + f(1), f(2) = f(1) + f(0)
        if (n == 1 || n == 2){
            return (1);
        } else {
            return fibonacci(n-1) + fibonacci(n-2); // f(n)=f(n-1)+f(n-2)
        }// 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        
        System.out.print("Total pasangan marmut pada bulan ke-");
        angka = input.nextInt();

        System.out.println("adalah " + fibonacci(angka) + " pasangan");
    }
}
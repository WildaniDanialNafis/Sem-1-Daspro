import java.util.Scanner;
public class Lingkaran{
    static double kelilingLingkaran(double jari_jari){
        return 3.14 * jari_jari;
    }
    static double kelilingLingkaran1(double jari_jari){
        return 2 * 3.14 * jari_jari;
    }
    static double luasLingkaran(double jari_jari){
        return jari_jari * jari_jari;
    }
    static double luasLingkaran1(double jari_jari){
        return 3.14 * jari_jari * jari_jari;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran : ");
        double jari = input.nextInt();

        System.out.println("--------------------------------------");
        System.out.println("Keliling Lingkaran adalah " + kelilingLingkaran(jari) + "π ≈ " + kelilingLingkaran1(jari));
        System.out.println("Luas Lingkaran adalah " + luasLingkaran(jari) + "π ≈ " + luasLingkaran1(jari));
        System.out.println("--------------------------------------");
    }
}
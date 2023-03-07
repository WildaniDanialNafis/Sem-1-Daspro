import java.util.Scanner;
public class TugasFungsi1_19{
    static int Max3(int bil1, int bil2, int bil3){
        int max = 0;
        int[] bil = {bil1, bil2, bil3};
        for (int i = 0; i < bil.length; i++){
            if (bil[i] > max){
                max = bil[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama : ");
        int bilPertama = input.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        int bilKedua = input.nextInt();
        System.out.print("Masukkan bilangan ketiga : ");
        int bilKetiga = input.nextInt();

        System.out.println("------------------------------------------------------");
        System.out.println("Nilai tertinggi dari ketiga bilangan tersebut adalah : " + Max3(bilPertama, bilKedua, bilKetiga));
        System.out.println("------------------------------------------------------");
    }
}
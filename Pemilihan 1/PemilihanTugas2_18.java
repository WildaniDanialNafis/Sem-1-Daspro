import java.util.Scanner;
public class PemilihanTugas2_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int umur;

        System.out.println("Masukkan umur :");
        umur = input.nextInt();

        if (umur >= 17) {
            System.out.println("Boleh Berkendara");
        }
        else {
            System.out.println("Tidak Boleh Berkendara");
        }
    }
}
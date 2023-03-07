import java.util.Scanner;

public class Pengulangan1_Tugas1_18{
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        int batasAngka, digitTerakhir ;
        String nim = "2231750007";

        System.out.print("Masukkan batas angka: ");
        batasAngka = scan.nextInt();

        int i;
        for (i= 1; i<= batasAngka; i++){
            if (nim.charAt(9)=='7'){
                digitTerakhir = 7+2;
                if (i%digitTerakhir==0){
                    continue;
                }
            }
            System.out.print(i + " ");
            
        }
    }
}
import java.util.Scanner;
public class TugasFungsi4_19 {
    static float rataRata(float nilai, int banyak){
        float rata;
        rata = nilai / banyak;
        return rata;
    }
    static float nilaiMax(float[] nilai){
        float max = 0;
        float[] nilaiSiswa = nilai;
        for (int i = 0; i < nilaiSiswa.length; i++){
            if (nilaiSiswa[i] > max){
                max = nilaiSiswa[i];
            }
        }
        return max;
    }
    static float nilaiMin(float[] nilai){
        float min = 100;
        float[] nilaiSiswa = nilai;
        for (int i = 0; i < nilaiSiswa.length; i++){
            if (nilaiSiswa[i] < min){
                min = nilaiSiswa[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] nilaiSiswa = new float[10];
        float jumlah = 0;
        
        for (int i = 0; i < nilaiSiswa.length; i++){
            System.out.printf("Masukkan nilai siswa ke-%d : ", i+1);
            float nilai = input.nextFloat();
            nilaiSiswa[i] = nilai;
        }
        for (int i = 0; i < nilaiSiswa.length; i++){
            jumlah += nilaiSiswa[i];
        }
        System.out.println("--------------------------------------------------");   
        System.out.println("Rata-rata nilai " + nilaiSiswa.length + " siswa adalah " + rataRata(jumlah, nilaiSiswa.length));
        System.out.println("Nilai tertingginya adalah : " + nilaiMax(nilaiSiswa));
        System.out.println("Nilai terendah adalah : " + nilaiMin(nilaiSiswa));
        System.out.println("--------------------------------------------------");   
    }
}
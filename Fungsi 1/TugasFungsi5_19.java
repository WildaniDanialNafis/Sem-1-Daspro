public class TugasFungsi5_19{
    static int[] isiArray(int[] namaArray){
        int[] array = namaArray;
        int isi = 1;
        for (int i = 0; i < array.length; i++){
            if (i % 2 == 0){
                array[i] = isi;
                isi++;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = new int[11];

        isiArray(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
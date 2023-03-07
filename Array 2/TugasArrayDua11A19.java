public class TugasArrayDua11A19{
    public static void main(String[] args) {
        char[] karakter = {'W', 'i', 'l', 'd', 'a', 'n', 'i', 'D', 'a', 'n', 'i', 'a', 'l', 'N', 'a', 'f', 'i', 's'};
        char[][] nama = new char[8][5];

        for (int i = 0; i < nama.length; i++){
            for (int j = 0; j < nama[0].length; j++){
                if ((i*nama[0].length+j) % karakter.length == (i*nama[0].length+j) % karakter.length){
                    nama[i][j] = karakter[(i*nama[0].length+j) % karakter.length];
                    }
                }
            }
        for (int i = 0; i < nama.length; i++){
            for (int j = 0; j < nama[0].length; j++){
                System.out.print(nama[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
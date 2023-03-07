public class Pengulangan1_Tugas2_18{
    public static void main(String[] args) {

        int tiketAnak = 50000, tiketDewasa = 100000, agustus = 31, pemasukan, total=0, jumlahAnak=5, jumlahDewasa=5;
        
        System.out.printf("Pengunjung Anak-anak per hari : %d\n", jumlahAnak);
        System.out.printf("Pengunjung Dewasa per hari : %d\n", jumlahDewasa);
        System.out.println("Banyak hari di Bulan Agustus : " + agustus);

        for (int tanggal= 1; tanggal<= agustus; tanggal++){
            
            if (twanggal == 7 ){
                int perTanggal = tanggal;

                System.out.printf("\nTanggal ke-%d libur hari Minggu tidak ada pemasukan", perTanggal);
                continue;
            } else if (tanggal == 14){
                int perTanggal = tanggal;

                System.out.printf("\nTanggal ke-%d libur hari Minggu tidak ada pemasukan", perTanggal);
                continue;
            } else if (tanggal == 21){
                int perTanggal = tanggal;

                System.out.printf("\nTanggal ke-%d libur hari Minggu tidak ada pemasukan", perTanggal);
                continue;
            } else if (tanggal == 28){
                int perTanggal = tanggal;

                System.out.printf("\nTanggal ke-%d libur hari Minggu tidak ada pemasukan", perTanggal);
                continue;
            }
            pemasukan = (jumlahAnak * tiketAnak) + (jumlahDewasa * tiketDewasa);
            total += pemasukan; // total = total + pemasukan
            System.out.printf("\nTotal pemasukan tanggal-%d adalah Rp. %d", tanggal, total);
            System.out.println("\nTotal pemasukan tanggal-" + tanggal + " adalah Rp. " + total);
        }
        System.out.println("\n---------------------------------------------");
        System.out.printf("Total pemasukkan sebulan = Rp. %d\n", total);
        System.out.println("---------------------------------------------");
    }
}
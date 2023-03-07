import java.util.Scanner;
public class Tugas2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float diskonItemBiru, diskonItemMerah;
        double hargaAsliItemMerah, hargaAsliItemBiru, hargaItemBiru, hargaItemMerah, uangYangHarusDibayar;

        System.out.print("Masukkan diskon Item Biru (dalam koma (50% = 0.5)) : ");
        diskonItemBiru = sc.nextFloat();
        System.out.print("\nMasukkan diskon Item Merah (dalam koma (30% = 0.3)): ");
        diskonItemMerah = sc.nextFloat();
        System.out.print("\nMasukkan harga asli Item Merah (tanpa titik (300000)) : ");
        hargaAsliItemMerah = sc.nextDouble();
        System.out.print("\nMasukkan harga asli Item Biru (tanpa titik (275000)) : ");
        hargaAsliItemBiru = sc.nextDouble();

        hargaItemBiru = hargaAsliItemBiru - (hargaAsliItemBiru * diskonItemBiru);
        hargaItemMerah = hargaAsliItemMerah - (hargaAsliItemMerah * diskonItemMerah);
        uangYangHarusDibayar = hargaItemBiru + hargaItemMerah;

        System.out.println("\nUang yang harus dibayar Susi adalah sebesar Rp. " + uangYangHarusDibayar);

    }
}
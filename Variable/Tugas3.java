import java.util.Scanner;
public class Tugas3{
    public static void main(String[] args) {
        float suhu, celcius, reamur, fahrenheit, kelvin;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Suhu : ");
        suhu = sc.nextFloat();
        celcius = suhu;
        reamur = (4 * celcius) / 5;
        fahrenheit = ((9 * celcius) / 5) + 32;
        kelvin = celcius + 273;

        System.out.println("Suhu dalam Celcius = " + celcius + " C");
        System.out.println("Suhu dalam Reamur = " + reamur + " R");
        System.out.println("Suhu dalam Fahrenheit = " + fahrenheit + " F");
        System.out.println("Suhu dalam Reamur = " + kelvin + " K");
    }
}
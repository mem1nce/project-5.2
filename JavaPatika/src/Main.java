import java.util.Scanner;

public class Main {


    public static double üsHesapla(int taban, int üs) {
        if (üs == 0) {
            return 1; // Her sayının 0. kuvveti 1'dir
        } else {
            return taban * üsHesapla(taban, üs - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayının tabanını giriniz: ");
        int a = input.nextInt();

        System.out.print("Sayının üssünü giriniz: ");
        int b = input.nextInt();

        double sonuc = üsHesapla(a, b);

        System.out.println("Sonuç: " + sonuc);


        input.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Harmonik_Ortalama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0, avarage = 0, harmonik=0, harm=0;
        int i;
        System.out.print("Dizi uzunluğunu girin girin: ");
        int uzunluk = sc.nextInt();
        int [] dizi = new int[uzunluk];
        for (i = 0; i < uzunluk; i++) {
            dizi[i] = sc.nextInt();
            sum += dizi[i];
            harm+=1/dizi[i];

        }
        harmonik=dizi.length/harm;
        System.out.println("Girdiğiniz dizi: " + Arrays.toString(dizi));
        avarage = sum / uzunluk;
        System.out.println("Dizinin aritmetik ortalaması: " + avarage);
        System.out.println("Dizinin aritmetik ortalaması: " + harmonik);
    }

}

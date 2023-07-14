import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, sonuc = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        sayi = sc.nextInt();
        System.out.println(sayi + " sayısının basamak değerleri'nin toplamı ");
        while(sayi !=0){
            sonuc += (sayi % 10);
            sayi /= 10;
        }
        System.out.println(sonuc + " 'dir");
    }
}
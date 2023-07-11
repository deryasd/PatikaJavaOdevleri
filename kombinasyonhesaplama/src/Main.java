import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı
        grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        Java ile kombinasyon hesaplayan program yazınız.
        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
        * */
        Scanner sc = new Scanner(System.in);
        int eleman, kombinasyon,faktoriyelElm,faktoriyelKmb,faktoriyelFrk,sonuc,fark;
        System.out.println("Küme eleman sayısını giriniz :");
        eleman = sc.nextInt();
        System.out.println("Grup içinde istenen eleman sayısını giriniz :");
        kombinasyon = sc.nextInt();
        fark = eleman - kombinasyon;
        faktoriyelElm =faktoriyelHesapla(eleman);
        faktoriyelKmb = faktoriyelHesapla(kombinasyon);
        faktoriyelFrk = faktoriyelHesapla(fark);
        sonuc =  (faktoriyelElm / (faktoriyelKmb * faktoriyelFrk));
        System.out.println(sonuc);
    }
    public static int faktoriyelHesapla(int sayi){
        if (sayi == 0)
            return 1;
        else
            return sayi * faktoriyelHesapla(sayi-1);
    }
}
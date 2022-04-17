package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int mat, fizik, kimya,turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik ortalaması :");
        mat = input.nextInt();
        System.out.print("Fizik ortalaması :");
        fizik = input.nextInt();
        System.out.print("Kimya ortalaması :");
        kimya = input.nextInt();
        System.out.print("Türkçe ortalaması :");
        turkce = input.nextInt();
        System.out.print("Tarih ortalaması :");
        tarih = input.nextInt();
        System.out.print("Müzik ortalaması :");
        muzik = input.nextInt();

        double toplam = (mat +fizik +kimya +turkce +tarih +muzik);
        float sonuc = (float) (toplam/6.0);
        System.out.println("Bütün Notların ortalama değeri :" +sonuc);

        String durum = (sonuc>60)? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println("Sınıfı Geçip Geçmeme Durumu :" +durum);
    }
}

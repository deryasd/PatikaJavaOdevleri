package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	int n1,n2,sonuc;
    Scanner sc = new Scanner(System.in);
    System.out.println("İlk Sayıyı Giriniz:");
    n1 = sc.nextInt();
    System.out.println("İkinci Sayıyı Giriniz:");
    n2 = sc.nextInt();

    System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
    int islem = sc.nextInt();

    switch (islem){
        case 1:
            sonuc = n1 + n2;
            System.out.println("Toplama: " + sonuc);
            break;
        case 2:
            sonuc = n1 - n2;
            System.out.println("Çıkarma: " + sonuc);
            break;
        case 3:
            sonuc = n1 * n2;
            System.out.println("Çarpma: " + sonuc);
            break;
        case 4:
            if (n2 == 0) {
                System.out.println("Bir sayı sıfıra bölünemez");
                break;
            }
            else{
                sonuc = n1 / n2;
                System.out.println("Bölme: " + sonuc);
                break;
            }
        default:
            System.out.println("Yanlış seçim yaptınız");
    }
    }
}

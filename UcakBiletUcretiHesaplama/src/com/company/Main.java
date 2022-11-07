package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 77
        Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
        sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/

        double mile, totalPrice, ageDiscount12 = 0.50, ageDiscount24 = 0.10, ageDiscount65 = 0.30, discount = 0.20;
        int age, type;


        Scanner sc = new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz");
        mile = sc.nextDouble();
        System.out.println("Yaşınızı giriniz");
        age = sc.nextInt();
        System.out.println("Yolculuk tipini seçiniz(1-> Tek Yön, 2-> Çift Yön)");
        type = sc.nextInt();

        if(mile >= 0 && age >= 0){
            totalPrice = mile * 0.10;
            if(age < 12)
                totalPrice -= totalPrice * ageDiscount12;
            else if(12 <= age && age <=24)
                totalPrice -= totalPrice * ageDiscount24;
            else if(12 <= age && age <=24)
                totalPrice -= totalPrice * ageDiscount65;
            switch(type) {
                case 1:
                    System.out.println("Bilet ücretiniz :" + totalPrice );
                    break;
                case 2:
                    totalPrice = (totalPrice - (totalPrice * discount)) * 2;
                    System.out.println("Bilet ücretiniz :" + totalPrice );
                    break;
            }
        }else
            System.out.println("Hatalı veri girdiniz !");
    }
}

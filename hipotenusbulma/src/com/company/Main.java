package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a,b,f;
        double c,d,e;

        Scanner kenar = new Scanner(System.in);
        System.out.println("Birinci Kenarı Giriniz");
        a = kenar.nextInt();
        System.out.println("İkinci Kenarı Giriniz");
        b = kenar.nextInt();
        System.out.println("Üçüncü Kenarı Giriniz");
        f = kenar.nextInt();

        //hipotenüs
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Üçgenin Hipotenüsü: "+ c);
        //alan
        d = a+b+f;
        e = Math.sqrt( d * (d - a)* (d - b) * (d - f));
        System.out.println("Üçgenin Alanı: "+ e);


    }
}

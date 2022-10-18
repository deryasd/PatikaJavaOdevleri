package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
        double totalUcret = 0, armutTotal, elmaTotal, domatesTotal, muzTotal, patlicanTotal;

        System.out.println("Kaç Kilo Armut Aldınız ?");
        armutTotal = input.nextDouble();
        totalUcret = armut * armutTotal;
        System.out.println("Kaç Kilo Elma Aldınız ?");
        elmaTotal = input.nextDouble();
        totalUcret += (elma*elmaTotal);
        System.out.println("Kaç Kilo Domates Aldınız ?");
        domatesTotal = input.nextDouble();
        totalUcret += (domates*domatesTotal);
        System.out.println("Kaç Kilo Muz Aldınız ?");
        muzTotal = input.nextDouble();
        totalUcret += (muz * muzTotal);
        System.out.println("Kaç Kilo Patlıcan Aldınız ?");
        patlicanTotal = input.nextDouble();
        totalUcret += (patlicanTotal*patlican);

        System.out.println("Toplam ücret: " + totalUcret);



    }
}

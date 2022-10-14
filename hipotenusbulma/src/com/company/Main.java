package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b;
        double c;

        Scanner kenar = new Scanner(System.in);
        System.out.println("Birinci Kenarı Giriniz");
        a = kenar.nextInt();
        System.out.println("İkinci Kenarı Giriniz");
        b = kenar.nextInt();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Üçgenin Hipotenüsü: "+ c);
    }
}

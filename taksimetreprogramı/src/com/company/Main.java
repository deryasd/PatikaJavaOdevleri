package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startPrice = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi giriniz: ");
        km = input.nextInt();
        total = startPrice + (perKm*km);
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar: "+ total);
    }
}

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month, day;

        Scanner sc = new Scanner(System.in);

        System.out.println("Doğduğunuz ayı giriniz");
        month = sc.nextInt();
        System.out.println("Doğum gününüzü giriniz");
        day = sc.nextInt();

        if(month == 1) {
            if (22 <= day)
                System.out.println("Kova burcusunuz");
            else
                System.out.println("Oğlak burcusunuz");
        }
        if(month == 2) {
            if (20 <= day)
                System.out.println("Balık burcusunuz");
            else
                System.out.println("Kova burcusunuz");
        }
        if(month == 3) {
            if (21 <= day)
                System.out.println("Koç burcusunuz");
            else
                System.out.println("Balık burcusunuz");
        }
        if(month == 4) {
            if (21 <= day)
                System.out.println("Boğa burcusunuz");
            else
                System.out.println("Koç burcusunuz");
        }
        if(month == 5) {
            if (22 <= day)
                System.out.println("İkizler burcusunuz");
            else
                System.out.println("Boğa burcusunuz");
        }
        if(month == 6) {
            if (23 <= day)
                System.out.println("Yengeç burcusunuz");
            else
                System.out.println("İkizler burcusunuz");
        }
        if(month == 7) {
            if (23 <= day)
                System.out.println("Aslan burcusunuz");
            else
                System.out.println("Yengeç burcusunuz");
        }
        if(month == 8) {
            if (23 <= day)
                System.out.println("Başak burcusunuz");
            else
                System.out.println("Aslan burcusunuz");
        }
        if(month == 9) {
            if (23 <= day)
                System.out.println("Terazi burcusunuz");
            else
                System.out.println("Başak burcusunuz");
        }
        if(month == 10) {
            if (23 <= day)
                System.out.println("Akrep burcusunuz");
            else
                System.out.println("Terazi burcusunuz");
        }
        if(month == 11) {
            if (22 <= day)
                System.out.println("Yay burcusunuz");
            else
                System.out.println("Akrep burcusunuz");
        }
        if(month == 12) {
            if (22 <= day)
                System.out.println("Oğlak burcusunuz");
            else
                System.out.println("Yay burcusunuz");
        }
    }
}

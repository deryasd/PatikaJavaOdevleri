package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;

        Scanner sc = new Scanner(System.in);

        System.out.println("Doğduğunuz yılı giriniz");
        year = sc.nextInt();

        if(year % 12 == 0) {
            System.out.println("Maymun burcusunuz");
        }
        else if(year % 12 == 1) {
            System.out.println("Horoz burcusunuz");
        }
        else if(year % 12 == 2) {
            System.out.println("Köpek burcusunuz");
        }
        else if(year % 12 == 3) {
            System.out.println("Domuz burcusunuz");
        }
        else if(year % 12 == 4) {
            System.out.println("Fare burcusunuz");
        }
        else if(year % 12 == 5) {
            System.out.println("Öküz burcusunuz");
        }
        else if(year % 12 == 6) {
            System.out.println("Kaplan burcusunuz");
        }
        else if(year % 12 == 7) {
            System.out.println("Tavşan burcusunuz");
        }
        else if(year % 12 == 8) {
            System.out.println("Ejderha burcusunuz");
        }
        else if(year % 12 == 9) {
            System.out.println("Yılan burcusunuz");
        }
        else if(year % 12 == 10) {
            System.out.println("At burcusunuz");
        }
        else if(year % 12 == 11) {
            System.out.println("Koyun burcusunuz");
        }

    }
}

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
        * "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        * Formül
        * Kilo (kg) / Boy(m) * Boy(m)
        * */
        double boy;
        double kilo, vücutKitleİndeksi;
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu Metre Cinsinden Giriniz:");
        boy = input.nextDouble();
        System.out.println("Kilo Giriniz:");
        kilo = input.nextDouble();

        vücutKitleİndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vücutKitleİndeksi);
    }
}

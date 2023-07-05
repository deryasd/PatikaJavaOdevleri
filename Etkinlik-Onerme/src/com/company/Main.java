package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int heat;

        Scanner sc = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz:");
        heat = sc.nextInt();

        if(heat<5)
            System.out.println("Kayak yapabilirsiniz.");
        else if (5 <= heat && heat <= 15)
            System.out.println("Sinemaya Gidebilirsiniz");
        else if (15 <= heat && heat <= 25)
                System.out.println("Pikniğe Gidebilirsiniz");
        else
            System.out.println("Yüzmeye Gidebilirsiniz");
    }
}

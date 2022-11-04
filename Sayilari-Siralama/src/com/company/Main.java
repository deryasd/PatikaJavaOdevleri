package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int x, y, z, biggest;

        Scanner sc = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz.");
        x = sc.nextInt();

        System.out.println("İkinci sayıyı giriniz.");
        y = sc.nextInt();

        System.out.println("Üçüncü sayıyı giriniz.");
        z = sc.nextInt();

        if (x < y && x < z){
            if(y < z)
                System.out.println(x + "<" + y + "<" + z);
            else
                System.out.println(x + "<" + z + "<" + y);
        }
        if (y < x && y < z){
            if(x < z)
                System.out.println(y + "<" + x + "<" + z);
            else
                System.out.println(y + "<" + z + "<" + x);
        }
        if (z < y && z < x){
            if(y < x)
                System.out.println(z + "<" + y + "<" + x);
            else
                System.out.println(z + "<" + x + "<" + y);
        }

    }
}

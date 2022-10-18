package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Yarıçapını Giriniz:");
        r = input.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: "+ alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        int merkezAci;

        System.out.println("Daire Diliminin Merkez Açı Ölçüsünü Giriniz:");
        merkezAci = input.nextInt();
        double daireDilimininAlani = (pi * (r * r) * merkezAci) / 360;

        System.out.println("Daire Diliminin Alani: " + daireDilimininAlani);
    }
}

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int year;

        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if(year % 4 == 0)
            System.out.println(year + " bir artık yıldır.");
        else if(year % 400 == 0)
            System.out.println(year + " bir artık yıldır.");
        else
            System.out.println(year + " bir artık yıl değildir.");

    }
}

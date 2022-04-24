package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double cost, text = 0.18, text2=0.08,costText,costWithText;
        Scanner input = new Scanner(System.in);
        System.out.print("Kdv'sinin hesaplanmasını istediğiniz ücret miktarını giriniz :");
        cost = input.nextDouble();

        if(cost<=1000){
            costText= cost * text;
            costWithText = cost + costText;
            System.out.println("Kdv'siz tutarı:"+cost);
            System.out.println("Kdv tutarı:"+costText);
            System.out.println("Kdv'li tutarı:"+costWithText);

        }
        else{
            costText = cost * text2;
            costWithText = cost + costText;
            System.out.println("Kdv'siz tutarı:"+cost);
            System.out.println("Kdv tutarı:"+costText);
            System.out.println("Kdv'li tutarı:"+costWithText);
        }
    }
}

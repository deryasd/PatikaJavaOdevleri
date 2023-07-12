import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi, us;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        sayi = sc.nextInt();
        System.out.println("Üs değerini giriniz :");
        us = sc.nextInt();
        System.out.println(1 + " ,");
        for (int i = 1; i <= us;i++){
            System.out.println(sayi + " ,");
            sayi*=sayi;
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bir sayı giriniz:");

        int sayi;
        Scanner sc = new Scanner(System.in);
        sayi = sc.nextInt();
        System.out.println("Girdiğiniz sayıya kadar olan 4 ve 5'in katı sayılar:\n");
        if (sayi == 0 || sayi > 0) {
            for (int i = 1; i <= sayi; i *= 4) {
                if (i <= sayi)
                    System.out.println(i + " ,");
            }
            for (int j = 1; j <= sayi; j *= 5) {
                if (j <= sayi)
                    System.out.println(j + " ,");
            }

        } else {
            System.out.println("0 ya da 0'dan büyük bir sayı giriniz :");
        }
    }
}
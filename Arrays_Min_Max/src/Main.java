import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz:");
        int number = sc.nextInt();
        System.out.println("Girdiğiniz Sayı: " + number);

        int greater = max, lower = min ;
        for (int i : list) {
            if(i > number && i < greater) {
                greater = i;
            }
            if (i < number && i > lower){
                lower = i;
            }
        }

        System.out.println("En Yakın Küçük Değer " + lower);
        System.out.println("En Yakın Büyük Değer " + greater);
    }
}
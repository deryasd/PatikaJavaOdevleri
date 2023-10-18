import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner sc = new Scanner(System.in);
        int right = 0;
        int selected;
        boolean isWin = false;
        int[] wrong = new int[5];
        while(right < 5){
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = sc.nextInt();
            if (selected < 0 || selected >99){
                System.out.println("Lütfen 0-100 arası bir değer giriniz.");
                continue;
            }
            if(selected == number) {
                System.out.println("Tebrikler, doğru bildiniz!");
                break;
            }else {
                System.out.println("Hatalı bir sayı giriniz.");
                if (selected > number){
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                }else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkınız: " + (5-right));

            }
        }
        if (!isWin){
            System.out.println("Kaybettiniz !");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
        }

    }
}
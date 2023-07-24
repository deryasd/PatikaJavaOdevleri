import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,mukemmelSayi = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        sayi = sc.nextInt();
        for (int i = 2; i < sayi;i++){
            if(sayi % i == 0){
                mukemmelSayi += i;
            }
        }
        if(sayi == mukemmelSayi){
            System.out.println(sayi + " bir mükemmel sayıdır.");
        } else if (sayi == 1) {
            System.out.println(sayi + " bir mükemmel sayı değildir.");
        } else{
            System.out.println(sayi + " bir mükemmel sayı değildir.");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int top = 0, sayi;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Bir çift sayı giriniz:\n" +
                    "Tek sayı girip programı sonlandırabilirsiniz.");
            sayi = sc.nextInt();
            if(sayi%2 == 0 || sayi%4 == 0){
                top += sayi;
            }

        }while (sayi %2 == 0);
        System.out.println("Girdiğiniz sayıların toplamı:"+" "+ top);
    }
}
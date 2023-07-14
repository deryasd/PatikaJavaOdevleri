import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double sonuc = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("N sayısını giriniz:");
        n = sc.nextInt();

        System.out.println("N'e kadar olan harmonik sayıların toplamı :");
        for(double i = 1; i<=n;i++){
            sonuc += (1/i);
        }
        System.out.println(sonuc);
    }
}
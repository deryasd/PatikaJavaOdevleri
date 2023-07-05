import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,top = 0, sayi = 0;
        double ort;
        System.out.print("Bir sayı giriniz:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("3 ve 4 ile tam bölünebilen sayılar:");
        for (int i = 0;i<=n;i++){
            if(i%3 == 0 && i%4 == 0){
                top +=i;
                System.out.print(i + ",");
                sayi++;}
        }
        ort = top / sayi;
        System.out.println("3 ve 4 ile bölünebilen sayıların ortalaması :"+ ort);
    }
}
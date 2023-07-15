import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2,result1 = 0, i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz:");
        sayi1 = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        sayi2 = sc.nextInt();
        if (sayi1 >= sayi2) {
            i = sayi1;
        }else
            i = sayi2;
        while (true){
            if ((sayi1 %i == 0) && (sayi2%i ==0)){
                System.out.println(sayi1 + " ve "+ sayi2 + " nin EBOB'u = "+i);
                break;
            } else
                i--;
        }

        j = 1 ;
        while (true){
            result1 += j;
            if ((result1 % sayi1 == 0) && (result1 % sayi2 == 0)){
                System.out.println(sayi1 + " ve "+ sayi2 + " nin EKOK'u = "+result1);
                break;
            } else
                j++;
        }
    }
}
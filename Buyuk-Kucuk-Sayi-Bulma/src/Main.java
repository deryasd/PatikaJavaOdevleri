import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayac, enKucuk, enBuyuk, sayi, i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz ?");
        sayac = sc.nextInt();

        System.out.println(i + "inci sayıyı giriniz.");
        sayi = sc.nextInt();
        enKucuk = sayi;
        enBuyuk = sayi;
        sayac--;

        while(sayac !=0){
            i++;
            System.out.println(i + "inci sayıyı giriniz.");
            sayi = sc.nextInt();
            if(sayi > enBuyuk){
                enBuyuk = sayi;
            } else if (sayi < enKucuk) {
                enKucuk = sayi;
            }
            sayac--;
        }
        System.out.println("En büyük sayı:"+ enBuyuk+"\n"+
                "En küçük sayı:"+ enKucuk);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        System.out.println("Bir tek sayı giriniz :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            for(int j =1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k = 1; k< (i*2);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=n-2;i>=0;i--){
            for(int j=1;j <=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
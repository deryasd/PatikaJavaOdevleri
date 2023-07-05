import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        System.out.print("Bir sayı giriniz:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0;i<=n;i++){
            if(i%2 == 0)
                System.out.print(i + " , ");
        }
    }
}
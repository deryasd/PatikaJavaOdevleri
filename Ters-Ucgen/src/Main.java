import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ******************* 19y
        //  ***************** 17y
        //   *************** 15y
        //    ************* 13y
        //     *********** 11y
        //      ********* 9y
        //       ******* 7y
        //        ***** 5y
        //         *** 3y
        //          * 1y
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz.");
        n = sc.nextInt();
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1;  k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
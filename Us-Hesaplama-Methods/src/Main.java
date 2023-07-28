import java.util.Scanner;

public class Main {
    static int power(int param_base, int param_exponent){
        if (param_exponent == 0){
            return 1;
        }
        return param_base * power(param_base, (param_exponent-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Taban değerini giriniz : ");
        int base = sc.nextInt();
        System.out.println("Üs değerini giriniz : ");
        int exponent = sc.nextInt();
        System.out.println(power(base,exponent));
    }
}
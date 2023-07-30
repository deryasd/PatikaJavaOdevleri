import java.util.Scanner;

public class Main {
    static void desenOlustur(int param_number, boolean param_limit, int param_storage) {
        if (param_limit) {
            if (param_number >= 0) {
                System.out.print(param_number + " ");
                desenOlustur(param_number - 5, param_limit, param_storage);
            } else {
                desenOlustur(param_number, false, param_storage);
            }
        } else {
            if (param_number <= param_storage) {
                System.out.print(param_number + " ");
                desenOlustur(param_number + 5, param_limit, param_storage);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int number = sc.nextInt();
        boolean limit = true;
        int storage = number;
        desenOlustur(number, limit,storage);
    }
}
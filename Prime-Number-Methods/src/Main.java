import java.util.Scanner;

public class Main {
    static boolean isPrime(int param_number, int param_counter,int param_divisor){
        if (param_number % param_divisor == 0){
            param_counter++;
        }
        if(param_divisor == param_number){
            if (param_counter <= 1){
                System.out.println(param_number + " bir asal sayıdır");
                return true;
            } else if (param_counter > 1) {
                System.out.println(param_number + " bir asal sayı değildir.");
                return false;
            }
        }
        return isPrime(param_number,param_counter,param_divisor+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int number = sc.nextInt();
        int counter = 0,divisor = 2;
        isPrime(number,counter,divisor);
    }
}
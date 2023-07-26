import java.util.Scanner;

public class Main {
    static int fibonacciSerisi(int number){
        if (number == 1 || number == 2)
            return 1;
        return fibonacciSerisi(number-1)+ fibonacciSerisi(number -2);

    }
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci serisinin kaçıncı elemanını bulmak isterseniz ?");
        number = sc.nextInt();
        System.out.println(number +".inci elemanı : "+ fibonacciSerisi(number));
    }
}
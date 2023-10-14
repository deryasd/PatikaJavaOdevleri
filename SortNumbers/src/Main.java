import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dizi boyunu giriniz.");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Dizi boyutu: " + n);
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int[] tempArr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            tempArr[i] = numbers[i];
        }

        for (int i = 0; i < tempArr.length; i++) {
            for (int j = i + 1; j < tempArr.length; j++) {
                if (tempArr[j] < tempArr[i]) {
                    int tempNumber = tempArr[i];
                    tempArr[i] = tempArr[j];
                    tempArr[j] = tempNumber;
                }
            }
        }

        System.out.println("Sıralanmış dizi:");
        for (int m : tempArr) {
            System.out.println(m);
        }
    }
}
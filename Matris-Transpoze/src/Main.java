import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int row, col;
        int[][] arr= ArrElements();
        PrintArr(arr);
        int[][] arrTranspoze = MatrisTranspoze(arr);
        System.out.println(" ");
        PrintArr(arrTranspoze);

    }

    private static int[][] MatrisTranspoze(int[][] arr) {

        int[][] tempArr = new int[arr[0].length][arr.length];
        for(int i = 0; i < tempArr.length; i++){
            for(int j = 0; j < tempArr[0].length; j++){
                tempArr[i][j] = arr[j][i];
            }
        }
        return tempArr;
    }

    private static void PrintArr(int[][] arr) {
        for(int i = 0;i< arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                System.out.print(arr[i][j] + " " );
            }
            System.out.println(" ");
        }
    }

    private static int[][] ArrElements() {
        Scanner sc = new Scanner(System.in);
        int row=0, col=0;

        System.out.println("Dizi satır sayısı giriniz :");
        row = sc.nextInt();
        System.out.println("Dizi sutün sayısı giriniz :");
        col = sc.nextInt();
        int[][] arr = new int[row][col];

        for(int i = 0;i< row;i++){
            for(int j = 0; j<col;j++){
                System.out.println((i+1) + " .satır " + (j+1) + " inci sutün elemanını giriniz :");
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }
}
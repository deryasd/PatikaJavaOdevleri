
public class Main {
    public static int[] Sort(int[] numbers){
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
        return tempArr;
    }
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        arr = Sort(arr);

        int counter = 1;
        for (int i =0 ; i<arr.length;i++){
            if(i < (arr.length-1)){
                if(arr[i + 1] == arr[i]){
                    counter++;
                } else if (arr[i] != arr[i+1]) {
                    System.out.println(arr[i]+" sayısı " + counter + " kadar tekrar etmektedir.");
                    counter = 1;
                }
            }
            else {
                System.out.println(arr[i]+" sayısı " + counter + " kadar tekrar etmektedir.");
                break;
            }
        }
    }
}
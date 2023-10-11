public class Main {
    public static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] numbers = {10,21,12,10,17,15,18,12,20,18};
        int[] numbers2 = new int[numbers.length];
        int index = 0;
        for (int i = 0; i< numbers.length;i++) {
            if(numbers[i] % 2 == 0){
                for (int j = 0; j< numbers2.length;j++){
                    if(i != j && numbers[j]==numbers[i]){
                        if(!isFind(numbers2,numbers[i])) {
                            numbers2[index] = numbers[i];
                            index++;
                        }
                        break;
                    }
                }
            }
        }
        for (int i : numbers2){
            if (i != 0)
                System.out.println(i);
        }
    }
}
import java.util.Arrays;

public class _3_6_BubbleSort4 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 8, 9, 4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

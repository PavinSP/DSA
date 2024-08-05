import java.util.Arrays;
public class _3_3BubbleSort3 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 8, 9, 4};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] bubbleSort(int[] arr){
        for (int j = arr.length; j > 0; j--){
            for (int i = 0; i < arr.length - 1; i++){
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}

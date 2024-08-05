import java.util.Arrays;

public class _3_5BubbleSortRough {
    public static void main(String[] args){
        int[] arr = {3, 45, 2, 1 ,67, 56};
        for (int j = arr.length; j > 0; j--){
            for (int i = 0; i < arr.length-1; i++){
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

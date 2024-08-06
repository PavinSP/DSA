import java.util.Arrays;

public class _5_1InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 8, 9, 4};
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}

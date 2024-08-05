import java.util.Arrays;

public class _4_2SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 8, 9, 4};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] selectionSort(int[] arr){
        int min;
        for (int i = 0; i < arr.length; i++){
            min = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

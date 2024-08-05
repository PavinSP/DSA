import java.util.Arrays;

public class _4_4SelectionSort {
     public static void main(String[] args) {
         int[] arr = {6, 5, 2, 8, 9, 4};
         System.out.println(Arrays.toString(arr));
         selectionSort(arr);
         System.out.println(Arrays.toString(arr));
     }
     public static int[] selectionSort(int[] arr){
         for (int i = 0; i < arr.length - 1; i++){
             int min = i;
             for (int j = i + 1; j < arr.length; j++){
                 if (arr[min] > arr[j]){
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
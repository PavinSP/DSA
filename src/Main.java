import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 8, 3, 7};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int min = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
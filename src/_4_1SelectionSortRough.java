import java.util.Arrays;

public class _4_1SelectionSortRough {
    public static void main(String[] args) {
        int[] arr = {3, 45, 2, 1 ,67, 56};
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
        System.out.println(Arrays.toString(arr));
    }
}

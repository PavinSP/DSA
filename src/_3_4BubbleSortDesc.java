import java.util.Arrays;

public class _3_4BubbleSortDesc {
    public static void main(String[] args) {

        int[] arr = {3, 45, 2, 1, 67, 56};
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j > 0; j--){
                if(arr[j-1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
//            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}

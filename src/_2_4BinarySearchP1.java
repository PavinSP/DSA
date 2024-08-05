public class _2_4BinarySearchP1 {
    public static void main(String[] args){
        int[] arr = {5, 6, 7, 8, 9, 11, 19, 21};
        System.out.println(binarySearch(arr, 11));
    }
    public static int binarySearch(int[] arr, int target){
        int first = 0;
        int last = arr.length-1;
        while (first<=last){
            int mid = (first+last)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        return -1;
    }
}
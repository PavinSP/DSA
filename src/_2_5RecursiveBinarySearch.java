public class _2_5RecursiveBinarySearch {
    public static void main(String[] args){
        int[] arr = {5, 6, 7, 8, 9, 11, 19, 21};
        System.out.println(BinarySearch(arr, 11, 0, arr.length-1));
    }
    public static int BinarySearch(int[] arr, int target, int left, int right){
        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return BinarySearch(arr, target, left, mid - 1);
            } else {
                return BinarySearch(arr, target, mid + 1, right);
            }
        }
        return -1;
    }
}

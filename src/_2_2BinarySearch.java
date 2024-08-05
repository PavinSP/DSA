public class _2_2BinarySearch {
    public static void main(String[] args){
        int[] arr1 = {5, 6, 7, 8, 9, 11, 19, 21};
        int[] arr2 = new int[1000];
        System.out.println(binarySearch(arr1, 11));
        System.out.println(binarySearch(arr2, 900));
    }
    public static int binarySearch(int[] arr, int target){
        int steps = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            steps++;
            int mid = (start+end) / 2;
            if (arr[mid] == target){
                System.out.println("Steps taken by BinarySearch is: " + steps);
                return mid;
            }
            else if (arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println("Steps taken by BinarySearch is: " + steps);
        return -1;
    }
}
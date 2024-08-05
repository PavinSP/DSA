public class _2_3LinearBinarySteps {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 5, 7, 9, 10, 11, 13};
        int target = 11;
        int[] array = new int[1000];
        int target2 = 900;
        System.out.println("The index is: " + LinearSearch(array, target2));
        System.out.println("The index is: " + BinarySearch(array, target2));
    }
    public static int LinearSearch(int[] arr, int target){
        int steps = 0;
        for (int i = 0; i < arr.length; i++){
            steps++;
            if (arr[i] == target){
                System.out.println("The no of steps in LinearSearch is " + steps);
                return i;
            }
        }
        System.out.println("The no of steps in LinearSearch is " + steps);
        return -1;
    }
    public static int BinarySearch(int[] arr, int target){
        int steps = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            steps++;
            int mid = (start + end) / 2;
            if (arr[mid] == target){
                System.out.println("The no of steps in BinarySearch is " + steps);
                return mid;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println("The no of steps in BinarySearch is " + steps);
        return -1;
    }
}
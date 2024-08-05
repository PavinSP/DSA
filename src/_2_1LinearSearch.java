public class _2_1LinearSearch {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 7, 8, 9, 11, 19, 21};
        int[] arr2 = new int[1000];
        System.out.println(linearSearch(arr1, 11));
        System.out.println(linearSearch(arr2, 900));
    }
    public static int linearSearch(int[] arr, int target){
        int steps = 0;
        for (int i = 0; i < arr.length; i++){
            steps++;
            if (arr[i] == target){
                System.out.println("Steps taken by LinearSearch is: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by LinearSearch is: " + steps);
        return -1;
    }
}

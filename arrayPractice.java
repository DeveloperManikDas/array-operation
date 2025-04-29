public class arrayPractice {

    // Short function for print
    public static void print(String name) {
        System.out.println(name);
    }

    // largest in array
    public static int largestNum(int arr[]) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;

    }

    // Binary search
    public static int binarySearch(int arr[], int k) {
        int start = 0;
        int end = (arr.length) - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int myArray[] = { 1, 3, 4, 5, 7, 8, 10 };

        // System.out.println(largestNum(myArray));
        // System.out.println(binarySearch(myArray, 8));

    }
}